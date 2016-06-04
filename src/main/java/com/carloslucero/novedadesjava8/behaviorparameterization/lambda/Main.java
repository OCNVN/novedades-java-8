package com.carloslucero.novedadesjava8.behaviorparameterization.lambda;

import com.carloslucero.novedadesjava8.behaviorparameterization.interfaces.Persona;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carloslucero on 04/06/16.
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

    public static void main(String[] args) {
        // Listado original de personas
        List<Persona> personas = crearPersonasList();
    }
}
