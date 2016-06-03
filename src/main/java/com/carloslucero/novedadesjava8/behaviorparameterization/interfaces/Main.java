package com.carloslucero.novedadesjava8.behaviorparameterization.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carloslucero on 02/06/16.
 */
public class Main {
    /**
     * Crear un listado de personas
     * @return
     */
    private static List<Persona> crearPersonasList() {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        personas.add(new Persona("Susana", "Crespo", 45, "Cuenca", "Ecuador", "1"));
        personas.add(new Persona("Eduardo", "Peralta", 23, "Azogues", "Ecuador", "12"));
        personas.add(new Persona("Thalia", "Garate", 31, "Quito", "Ecuador", "123"));
        personas.add(new Persona("Johanna", "Tenesaca", 30, "Cuenca", "Ecuador", "1234"));
        personas.add(new Persona("Zulay", "Alvarado", 22, "Riobamba", "Ecuador", "12345"));
        personas.add(new Persona("David", "Rios", 22, "Cuenca", "Ecuador", "123456"));
        personas.add(new Persona("Marco", "Avila", 14, "Guayaquil", "Ecuador", "1234567"));

        return personas;
    }

    /**
     * Filtra un listado de personas en base a una expresion que llega como argumento utilizando la tecnica behavior parameterization
     * el contrato entre este metodo y la implementacion del filtro lo establece la interfaz IFiltro
     * @param listaOriginal
     * @param filtroImpl
     * @return
     */
    private static List<Persona> filtrar(List<Persona> listaOriginal, IFiltro filtroImpl){
        ArrayList<Persona> listaFiltrada = new ArrayList<Persona>();
        for(Persona persona : listaOriginal){
            if(filtroImpl.filtrar(persona)){
                listaFiltrada.add(persona);
            }
        }

        return listaFiltrada;
    }

    /**
     * Imprime un listado de personas
     * @param personas
     */
    private static void imprimirLista(String leyenda, List<Persona> personas) {
        System.out.println("*******************************");
        System.out.println("Listado de: " + leyenda);
        for(Persona persona : personas)
            System.out.println(persona.nombre);
    }

    public static void main(String[] args) {
        // Listado original de personas
        List<Persona> personas = crearPersonasList();

        // Creo un listado de personas filtrando unicamente las que pertenecen a la ciudad de Cuenca
        List<Persona> personasDeCuenca = filtrar(personas, new IFiltro<Persona>() {
            public Boolean filtrar(Persona entidad) { // Metodo utilizado para filtrar
                return entidad.ciudad.compareTo("Cuenca") == 0; // Expresion que evalua si la persona es de Cuenca
            }
        });
        imprimirLista("Personas de la ciudad de Cuenca", personasDeCuenca);

        // Creo un listado de personas filtrando unicamente las que pertenecen a la ciudad de Cuenca
        List<Persona> personasMayoresEdad = filtrar(personas, new IFiltro<Persona>() {
            public Boolean filtrar(Persona entidad) { // Metodo utilizado para filtrar
                return entidad.edad >= 18; // Expresion que evalua si la persona es mayor de edad
            }
        });
        imprimirLista("Personas mayores de edad", personasMayoresEdad);
    }
}