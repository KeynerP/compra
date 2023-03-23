package com.example.compra.application;

import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraSaveService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class CompraSave {

  private final CompraSaveService compraSaveService;


  public Compra saveCompra(Compra compra){ return compraSaveService.save(compra);}
  public void saveCompras(List<Compra> compras){ compraSaveService.saveCompras(compras);}

}
