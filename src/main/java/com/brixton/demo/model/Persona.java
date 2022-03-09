package com.brixton.demo.model;

import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@ToString
public class Persona {

    private String nombre;
    private String apellidos;
    private Integer edad;
    private Short talla;
    private Integer nroDni;

    public void setNombre(String nombreNuevo) {
        this.nombre = nombreNuevo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellidos(String apellidoPaternoyMaterno){
        this.apellidos = apellidoPaternoyMaterno;
    }
    public String getApellidos() {
        return this.apellidos;
    }

    public void setEdad (Integer edadActual){
        this.edad = edadActual;
    }

    public Integer getEdad(){
        return this.edad;
    }

    public void aumentarEdad1Anio() {
        setEdad(   getEdad()+1    );
    }

    public void setNroDni (Integer doc){
        this.nroDni = doc;
    }

    public Integer getNroDni() {
        return this.nroDni;
    }



    public void setTalla(Short tallaXl) {
        this.talla = tallaXl;
    }

    public Short getTalla() {
        return this.talla;
    }
/*
    public static void main(String [] argv) {

        Persona p1 = new Persona();

        System.out.println("valor p1: " +  p1.toString());
        //System.out.println("valor p2: " + p2.toString());
        //System.out.println("valor p3: " + p3.toString());
        p1.setNombre("DAVID");
        p1.setEdad(15);
        p1.setApellidos("ROJAS ALVARADO");
        System.out.println("valor de p1: " + p1.toString());
        p1.setNombre("CARLOS");
        System.out.println("valor de p1: " + p1.toString());

        System.out.println("edad de p1: " + p1.getEdad());

        p1.aumentarEdad1Anio();
        System.out.println("eadad de p1: " + p1.getEdad());

        Persona eduardo = new Persona();
       eduardo.setNombre("EDUARDO");
        eduardo.setEdad(17);
        eduardo.setApellidos("CARDENAS CRUZ");

        Persona lidia = new Persona();
        lidia.setNombre("LIDIA");
        lidia.setEdad(18);
        lidia.setApellidos("CARDENAS CRUZ");
        lidia.setNroDni(70243392);

        Persona martin = new Persona();
        martin.setNombre("MARTIN");
        martin.setEdad(19);
        martin.setApellidos("CARDENAS CRUZ");
        martin.setNroDni(70243393);

        System.out.println("lidia: " + lidia.toString());
        System.out.println("eduardo: " + eduardo.toString());
        System.out.println("martin: " + martin.toString());



    }
*/

}




