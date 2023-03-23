package com.example.compra.domain.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@ToString
@Setter
public class Compra {

  private final String id;
  private final String idProducto;

  private final Double totalCompra;

  public Compra(String id, String idProducto, Double totalCompra) {
    this.id = id;
    this.idProducto = idProducto;
    this.totalCompra = totalCompra;
  }
}
