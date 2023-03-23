package com.example.compra.infrastructure.adapter;

import com.example.compra.domain.entities.Compra;
import com.example.compra.domain.service.CompraSaveService;

import com.example.compra.infrastructure.mapper.CompraMapper;
import com.example.compra.infrastructure.repository.CompraRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CompraSaveAdapter implements CompraSaveService {
  private final CompraRepository compraRepository;
  private final CompraMapper compraMapper;

  @Override
  public Compra save(Compra compra) {
    return compraMapper.toCompra(compraRepository.save(compraMapper.toCompradto(compra)));

  }

  @Override
  public void saveCompras(List<Compra> compras){
    for (Compra compra : compras) {

      compraRepository.save(compraMapper.toCompradto(compra));

    }
  }

}






