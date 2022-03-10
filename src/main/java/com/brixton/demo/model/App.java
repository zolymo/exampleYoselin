package com.brixton.demo.model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class App {

     public static void main(String [] arg) {

          Producto tv = new Producto();
          tv.setCodigo("T003");
          tv.setNombre("TV LED");
          tv.setStock(7);
          tv.setPrecioUnitario(1500.00);

          Producto radio = new Producto();
          radio.setCodigo("R006");
          radio.setNombre("RADIO FM");
          radio.setStock(12);
          radio.setPrecioUnitario(39.87);

          List<Producto> catalogo = new ArrayList<>();
          catalogo.add(tv);
          catalogo.add(radio);


          System.out.println(  catalogo.get(0));
          System.out.println( catalogo.get(1) );

          catalogo.get(0).venderProducto(5);

          catalogo.get(1).venderProducto(4);

          catalogo.get(0).llegaProductos(6);

          catalogo.get(0).venderProducto(15);

          catalogo.get(1).llegaProductos(15);


          System.out.println(catalogo.get(0));
          System.out.println(catalogo.get(1));
     }


         //---------------------Cargar mis productos Catalogo--------------
      /*
      1. Crear 2 productos
      2. Añadir al catalogo
      2.1 Imprimir prod1, prod2
      3. Vender 5 un del prod1
      4. Vender 4 unid del prod2
      5. Comprar 6 unid del prod 1
      6. Vender 15 unid del prod1
      7. Comprar 15 unid del prod2
      7.1. Imprimir prod1, prod2
      * */



          /*
          List<Producto> catalogo = new ArrayList<>();
          //crear producto
          //catalogo.add(PRUDCTO);
          //añades producto al catalgo

          ///////
          //TRAER EL PRODUCTO 0
          //System.out.println("que sera? : " + catalogo.get(2));
          //VENDER PRODUCTO 1
          catalogo.get(0).venderProducto(2);
          System.out.println(catalogo.get(0));
          catalogo.get(0).venderProducto(3);
          System.out.println(catalogo.get(0));
          catalogo.get(0).llegaProductos(10);
         // System.out.println(catalogo.get(0));


     }*/


}
