package com.example.compra.infrastructure.repository;

import com.example.compra.infrastructure.dto.CompraDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<CompraDto, String> {


}