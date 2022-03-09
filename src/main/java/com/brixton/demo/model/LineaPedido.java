package com.brixton.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LineaPedido {
    private String codigoProducto;
    private Integer cantidad;
    private Double precioUnitario;
    private Double total;

    public Double getTotal() {
        return getCantidad() * getPrecioUnitario();
    }

}
