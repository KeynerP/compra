package com.example.compra.domain.service;

import com.example.compra.domain.entities.Compra;
import java.util.List;

public interface CompraSaveService {

  Compra save (Compra compra);
  void saveCompras(List<Compra> compras);

}
