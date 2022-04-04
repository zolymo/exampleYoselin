package com.brixton.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
public class Tarea {

    public static void main(String[] args) {

        //* DECLARACION*//

        byte edad;
        short codPostal;
        double altura;
        String varon;
        String mujer;
        byte numHijos;
        double iva;
        double tallaCamisa;
        double peso;
        double precio;
        boolean esAlumnoBueno;
        boolean alumnoMalo;
        String msje;
        String letra;
        byte mayorEdad;
        byte minutos;
        short cantDias;
        String placa;
        int contador;

        //* operaciones*//

        int a = (3/2) + (4/3);

        int x = 7;
        int y = 3;
        int b = (1 / (x - 5)) - (3 * x * y / 4);

        int c = (1/2) + 7;

        int d = 7 + (1/2);

        int f = 8;
        int g = 7;
        int h = 3;
        int j = 4;
        int e = ((a*a)/(b-c)) + ((d-3) / (f-(g * h / j )));

        double m = 4.7;
        byte n = 47;
        byte p = 32;
        double f1 = (m/n) + p;

        byte q = 54;
        double g1 = m + (n / (p-q));

        int h1 = ((a*a)/(b*b)) + ((c*c)/ (d*d));

        int r = 23;
        double s = 7.3;
        double i = (m + (n/p)) / (q - (r/s));

        int j1 = (3*a+b) / (c-(d+5*e)/(f+ g/(2*h)));

        int k = ((a*a)+(2*a*b)+(b*b)) / (1/(x*x)+2);

        //* expresion matematica en word/*

        int aa = (b/2) - (4*a*c);

        int z = 1;
        int ee = 1/y + ((3*x)/(z+1));

        int bb= (3*x*y) - ((5*x)+ (12*x+17));

        int ff= (1/(y+3)) + x/(y+1);

        int cc = (b+d) / (c+4);

        int gg = 1/y + (3+x) / (y+1);

        int dd = (x*y) / y+2;

        //* operadores aritmeticos ENTEROS//*

        byte AA = 8;
        byte BB = 3;
        byte CC = 5;

        int rpta1 = AA + BB + CC;
        int rpta2 = 2*BB+3*(AA-CC);
        int rpta3 = AA / BB;
        int rpta4 = AA % BB;
        int rpta5 = AA / CC;
        int rpta6 = AA % CC;
        int rpta7 = AA * BB / CC;
        int rpta8 = AA * (BB / CC);
        int rpta9 = (AA * CC) % BB;
        int rpta10 = AA * (CC % BB);
        int rpta11 = (3*AA-2*BB) % (2*AA-CC);
        int rpta12 = 2*(AA/5+(4-BB*3)) % (AA+CC-2);
        int rpta13 = (AA-3*BB) % (CC+2*AA) / (AA-CC);
        int rpta14 = AA-BB-CC*2;

        //* operadores aritmeticos DECIMALES//*

        byte xx = 88;
        double yy = 3.5;
        double zz = -5.2;

        double rpta15 = xx + yy + zz;
        double rpta16 = 2 * yy + 3 * (xx-zz);
        double rpta17 = xx / yy;
        double rpta18 = xx % yy;
        double rpta19 = xx / (yy+zz);
        double rpta20 = (xx/yy) + zz;
        double rpta21 = 2 * xx / (3*yy);
        double rpta22 = 2 * xx / 3 * yy;
        double rpta23 = xx * yy % zz;
        double rpta24 = xx * (yy % zz);
        double rpta25 = 3 * xx - zz - 2 * xx;
        double rpta26 = 2 * xx / 5 % yy;
        double rpta27 = xx - 100 % yy % zz;
        double rpta28 = xx - yy - zz * 2;
        System.out.println(rpta28);

        //* boolean//*

        boolean ww = false;
        boolean xxx = true;
        boolean yyy = true;
        boolean zzz = false;

        boolean val1 = ww||yyy&&xxx&&ww||zzz;
        System.out.println(val1);

        boolean val2 = xxx && !yyy && !xxx || !ww && yyy;
        System.out.println(val2);

        boolean val3 = !(ww||!yyy)&&xxx||zzz;
        System.out.println(val3);

        boolean val4 = xxx && yyy && ww || zzz || xxx;
        System.out.println(val4);

        boolean val5 = yyy || !(yyy || zzz && ww);
        System.out.println(val5);

        boolean val6 = !xxx && yyy && (!zzz || !xxx);
        System.out.println(val6);

        double residuo = 17.5 % 5;
        System.out.println(residuo);

        System.out.printf("%s%n%s%n", "este es un", "programa en java");






























    }
}
