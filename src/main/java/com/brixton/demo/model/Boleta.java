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

 public static void main(String [] argv) {
     LineaPedido l1 = new LineaPedido();
     l1.setPrecioUnitario(1.0);
     l1.setCantidad(1);

     //------
  LineaPedido l2 = new LineaPedido();
  l2.setPrecioUnitario(5.0);
  l2.setCantidad(1);

  LineaPedido l3 = new LineaPedido();
  l3.setPrecioUnitario(4.0);
  l3.setCantidad(2);

  LineaPedido l4 = new LineaPedido();
  l4.setPrecioUnitario(15.0);
  l4.setCantidad(2);


  LineaPedido l5 = new LineaPedido();
  l5.setPrecioUnitario(15.0);
  l5.setCantidad(1);

/*
  Double sumatoria = 0.0;
  System.out.println("valor de sumatoria" + sumatoria);
    sumatoria = sumatoria + l1.getTotal();  //1
  System.out.println("valor de sumatoria" + sumatoria);
    sumatoria = sumatoria + l2.getTotal(); //6
  System.out.println("valor de sumatoria" + sumatoria);
    sumatoria = sumatoria + l3.getTotal(); //14
  System.out.println("valor de sumatoria" + sumatoria);
*/
    List<LineaPedido> ventas;
    ventas =  new ArrayList<>();
    ventas.add(l1);
    ventas.add(l2);
    ventas.add(l3);
    ventas.add(l4);
    ventas.add(l5);
  System.out.println("cantidad de ventas " + ventas.size());
  Double sumatoria = 0.0;

  for ( LineaPedido linea: ventas) {
   System.out.println("valor de linea " + linea);
   sumatoria = sumatoria + linea.getTotal();  //1
  }
  System.out.println("valor de sumatoria" + sumatoria);



 }


}