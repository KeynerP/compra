package com.example.compra.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompraDto {
  @Id
  private String id;
  private String idProducto;
  private Double totalCompra;

}

