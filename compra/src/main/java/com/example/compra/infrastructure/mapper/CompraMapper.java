package com.example.compra.infrastructure.mapper;

import com.example.compra.domain.entities.Compra;
import com.example.compra.infrastructure.dto.CompraDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompraMapper {


  CompraDto toCompradto(Compra compra);
  Compra toCompra(CompraDto compraDto);
}
