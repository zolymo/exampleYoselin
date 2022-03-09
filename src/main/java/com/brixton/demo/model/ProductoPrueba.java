package com.brixton.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductoPrueba {
    private String codigo;
    private String nombre;
    private  Integer stock;
    private Double precioUnitario;

    //1
    public Integer verificarStock(){
        System.out.println("VERIFICANDO STOCK");

        if( 10 >= getStock()) {
            System.out.println("ALERTA SOLO QUEDA " + getStock() + " productos");
        }else {
            System.out.println("PRODUCTO ABASTECIDO");
        }
        return getStock();
    }

    public void venderProducto(Integer cuantoQuieres) {

        // IF ( CONDICION COMPARACION )  ES CIERTA ... ENTONCES HAZ {
        // .... LO QUE ESTA ENTRE LAS LLAVES
        //}  ELSE  -----NO ES CIERTO (SINO) {
        //  HAZ LO QUE ESTA ENTRE LLAVES
        //}
        if ( cuantoQuieres > verificarStock()) {
            System.out.println("NO TENGO SUFICIENTE, solo tengo: " + getStock()+", " + getNombre());
        }  else {
            System.out.printf("SI TENGO "+ getNombre());
        }
        //
    }



}
