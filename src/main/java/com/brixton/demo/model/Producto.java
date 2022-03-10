package com.brixton.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Producto {
    private String codigo;
    private String nombre;
    private  Integer stock;
    private Double precioUnitario;

    //1
    public Integer verificarStock(){
        if( 10 >= getStock()) {
            System.out.println("ALERTA SOLO QUEDA " + getStock() + " productos");
        }
        return getStock();
    }

    public void venderProducto(Integer cuantoQuieres) {
        System.out.println("CANTIDAD QUE QUIERE EL CLIENTE: " + cuantoQuieres);
        // IF ( CONDICION COMPARACION )  ES CIERTA ... ENTONCES HAZ {
        // .... LO QUE ESTA ENTRE LAS LLAVES
        //}  ELSE  -----NO ES CIERTO (SINO) {
        //  HAZ LO QUE ESTA ENTRE LLAVES
        //
        if ( cuantoQuieres < verificarStock()) {
            recalcularStockPorVenta(cuantoQuieres);
        }

    }

    public void llegaProductos(Integer cuantoRecibes) {
        recalcularStockPorCompra(cuantoRecibes);
    }


    public void recalcularStockPorVenta(Integer cantidadAActualizar) {
        //miStock = miStock + cantidadAActualizar;
        setStock( getStock() - cantidadAActualizar );
    }

    public void recalcularStockPorCompra(Integer cantidadAActualizar) {
        //miStock = miStock + cantidadAActualizar;
        setStock( getStock() + cantidadAActualizar );
    }

}
