package com.brixton.demo.model;

public class AppNueva {

    public static void main(String[] args) {
        int x;
        x = 4;

        byte va1 = 1;
        System.out.println(va1);
        short va2 = 2;
        System.out.println(va2);
        int va3 = 3;
        System.out.println(va3);
        long va4 = 4;
        System.out.println(va4);
        float va5 = 5;
        System.out.println(va5);
        double va6 = 6;
        System.out.println(va6);
        boolean va7= false;
        System.out.println(va7);
        //OPERADORES + - / *

        int SUMA = 1 + 2;
        int RESTA = 5 - 2;
        double N=  (10 / 8);
        int MULTIPLICACION = 5 * 6;

        boolean COMPARACION = 5 > 6;

        int SU1 = SUMA + RESTA;
        System.out.println(SU1);

        boolean COM2 = SUMA >= RESTA;
        System.out.println("COMPARACION 2 "+ COM2);
//   OPERADORES DE COMPARACION < > <= >= ==
        System.out.println("VALOR DE LA SUMA "  + SUMA);
        System.out.println("VALOR DE LA RESTA "  + RESTA);
        System.out.println("VALOR DE LA DIVISION "  + N);
        System.out.println("VALOR DE LA MULTIPLICACION "  + MULTIPLICACION);
        System.out.println(COMPARACION);

        int mayoriadeEdad = 28;
        int edadYoselin = 27;
        int edadAngela = 17;

        boolean yoselinesMayordeEdad = edadYoselin >= mayoriadeEdad;

        System.out.println(" resultado yoselinesMayordeEdad " + yoselinesMayordeEdad);
        boolean angelaMayorEdad = edadAngela >= mayoriadeEdad;
        System.out.println("resultado angelaMayorEdad " + angelaMayorEdad);
        System.out.println(mayoriadeEdad);
        System.out.println(edadAngela);
        System.out.println(edadYoselin);





























    }

}
