package com.example.compra.listen;

import com.example.compra.application.CompraSave;
import com.example.compra.domain.entities.Compra;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class Receiver {

  private final CompraSave compraSave;
  private final ObjectMapper objectMapper;

  public static String RECEIVE_METHOD_NAME = "receiveMessage";

  @RabbitListener(queues = "prueba")
  public void receiveMessage(Message message) throws JsonProcessingException {

    String type = (String) message.getMessageProperties().getHeaders().get("type_compra");
    String types = (String) message.getMessageProperties().getHeaders().get("type_compras");

    String messageReceived = new String(message.getBody(), StandardCharsets.UTF_8);

    if ("COMPRA".equals(type)) {
      Compra compra = objectMapper.readValue(messageReceived, Compra.class);
      compraSave.saveCompra(compra);

    } else if ("COMPRAS".equals(type)) {
      List<Compra> compras = objectMapper.readValue(messageReceived, Compra.class);
      compraSave.saveCompras(compras);
    }

  }
}
