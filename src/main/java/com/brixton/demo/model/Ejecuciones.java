package com.brixton.demo.model;

public class Ejecuciones {
    public static void main(String [] argv) {

        ProductoPrueba polo = new ProductoPrueba();
        polo.setCodigo("P001");
        polo.setNombre("POLO");
        polo.setStock(15);
        polo.setPrecioUnitario(25.30);

        ProductoPrueba Short = new ProductoPrueba();
        Short.setCodigo("S001");
        Short.setNombre("SHORT");
        Short.setStock(8);
        Short.setPrecioUnitario(18.70);

        ProductoPrueba perfume = new ProductoPrueba();
        perfume.setCodigo("PE04");
        perfume.setNombre("PERFUME");
        perfume.setStock(3);
        perfume.setPrecioUnitario(59.90);

        ProductoPrueba collar = new ProductoPrueba();
        collar.setCodigo("C002");
        collar.setNombre("PERLA");
        collar.setStock(2);
        collar.setPrecioUnitario(59.90);

        ProductoPrueba zapato = new ProductoPrueba();
        zapato.setCodigo("Z024");
        zapato.setNombre("ROJOS");
        zapato.setStock(7);
        zapato.setPrecioUnitario(100.00);


        ProductoPrueba  arete = new ProductoPrueba();
        arete.setCodigo("A012");
        arete.setNombre(" FLOREADO");
        arete.setStock(1);
        arete.setPrecioUnitario(100.00);




        System.out.println( "prod1 " + polo );
        System.out.println( "prod2 " + Short  );
        System.out.println( "prod3 " + perfume  );
        System.out.println( "prod4 " + collar  );
        System.out.println( "prod5 " + zapato  );
        System.out.println( "prod6 " + arete );


        polo.venderProducto(40);
        Short.venderProducto(2);
        perfume.venderProducto(5);
        collar.venderProducto(10);
        zapato.venderProducto(21);
        arete.venderProducto(18);







    }
}
