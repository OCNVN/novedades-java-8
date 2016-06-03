package com.carloslucero.novedadesjava8.behaviorparameterization.interfaces;

/**
 * Created by carloslucero on 02/06/16.
 */
public class Persona {
    String nombre;
    String apellido;
    Integer edad;
    String ciudad;
    String pais;
    String dni;

    public Persona(String nombre, String apellido, Integer edad, String ciudad, String pais, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
        this.pais = pais;
        this.dni = dni;
    }
}
