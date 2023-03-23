package com.example.compra.application;

import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraGet {


  private final CompraGetService compraGetService;

  public Compra getCompra(String id){
    return compraGetService.get(id);
  }
}
