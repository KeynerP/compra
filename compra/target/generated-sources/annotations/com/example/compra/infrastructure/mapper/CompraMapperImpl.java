package com.example.compra.infrastructure.mapper;

import com.example.compra.domain.entities.Compra;
import com.example.compra.infrastructure.dto.CompraDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-23T00:16:43-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CompraMapperImpl implements CompraMapper {

    @Override
    public CompraDto toCompradto(Compra compra) {
        if ( compra == null ) {
            return null;
        }

        CompraDto compraDto = new CompraDto();

        compraDto.setId( compra.getId() );
        compraDto.setIdProducto( compra.getIdProducto() );
        compraDto.setTotalCompra( compra.getTotalCompra() );

        return compraDto;
    }

    @Override
    public Compra toCompra(CompraDto compraDto) {
        if ( compraDto == null ) {
            return null;
        }

        String id = null;
        String idProducto = null;
        Double totalCompra = null;

        id = compraDto.getId();
        idProducto = compraDto.getIdProducto();
        totalCompra = compraDto.getTotalCompra();

        Compra compra = new Compra( id, idProducto, totalCompra );

        return compra;
    }
}
