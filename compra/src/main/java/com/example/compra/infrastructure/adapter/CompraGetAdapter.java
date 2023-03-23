package com.example.compra.infrastructure.adapter;

import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraGetService;
import com.example.compra.infrastructure.dto.CompraDto;
import com.example.compra.infrastructure.mapper.CompraMapper;
import com.example.compra.infrastructure.repository.CompraRepository;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@AllArgsConstructor
@Service
public class CompraGetAdapter implements CompraGetService {

  private final CompraRepository compraRepository;
  private final CompraMapper compraMapper;

  @Override
  public Compra get(String id){
    Optional<CompraDto> compraDto = compraRepository.findById(id);
    if (compraDto.isEmpty()){
      log.info("La lista esta vacia.");
    }
    return compraMapper.toCompra(compraDto.get());
  }


}
