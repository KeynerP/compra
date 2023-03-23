package com.example.compra.infrastructure.api.controller;

import com.example.compra.application.CompraSave;
import com.example.compra.domain.entities.Compra;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import org.hibernate.annotations.ListIndexBase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@ListIndexBase
@AllArgsConstructor
@RestController
@RequestMapping(path = "/comp")
public class CompraController {


  private final CompraSave compraSave;
  List<Compra> listacompras = new ArrayList<Compra>();

  //Añadir Compra
  @PostMapping("/postCompra")
  public List<Compra> addCompra(@RequestBody Compra compra) {
    listacompras.add(compra);
    return listacompras;
  }

  @PostMapping("/postCompras")
  public void addCompras(@RequestBody List<Compra> compras) {
    compraSave.saveCompras(compras);
  }
}


