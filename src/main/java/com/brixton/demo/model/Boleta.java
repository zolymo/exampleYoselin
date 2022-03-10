package com.brixton.demo.model;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class Boleta {

 private Integer dni;
 private String nombre;
 private Integer razonSocial;
 private Integer codigoBoleta;
 private LocalDateTime fechaEmision;
 private Double subTotal; //suma el total de cada linea
 private Double igv = 0.18;
 private Double montoIgv; //(SUBTOTAL * IGV )
 private Double total; //(SUBTOTAL + MONTO_IGV)
 private List<LineaPedido> lineas; //tienes 0 a N Lineas de Pedido


 //Calculo de subtotal
 public Double getSubTotal() {
    Double sumatoria = 0.0;
  for (LineaPedido linea: lineas ) {
   sumatoria = sumatoria + linea.getTotal();
  }
    return sumatoria;
 }

 //calcular montoIgv
 public Double getMontoIgv() {
   return getSubTotal() * getIgv(); // 100 * 0.18 ---
 }

 //Calcular Total
 public Double getTotal(){
  return getSubTotal() + getMontoIgv();
 }



}