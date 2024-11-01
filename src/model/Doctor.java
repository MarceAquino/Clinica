package model;

import constantes.Especialidad;
import interfaz.IMedico;

import java.util.HashSet;
import java.util.Set;

public abstract class Doctor implements IMedico {

    protected String nombre;
    protected int legajo;
    protected Especialidad especialidad;
    private static final Set<Integer> legajos = new HashSet<>();

    public Doctor(String nombre, int legajo, Especialidad especialidad) {
        this.nombre = validarNombre(nombre);
        this.legajo = validarLegajo(legajo);
        this.especialidad = especialidad;
    }


    private int validarLegajo(int legajo) {
        if (!legajos.add(legajo)) {
            throw new IllegalArgumentException("El legajo ya esta registrado.");
        }
        return legajo;
    }

    private String validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty() || !nombre.matches("[a-zA-Z\\s]+")) {
            throw new IllegalArgumentException("El nombre solo puede contener letras.");
        }
        return nombre;
    }
    //Consultar
    /*
    protected void diagnosticarPaciente() {
        System.out.println("El paciente esta siendo diagnosticado por: " + nombre +"\n"+"Su especialidad es: " + especialidad);
    }

    protected void tratamientoPaciente() {
        System.out.println("El Doctor " + nombre +" recomendo reposo como parte del tratamiento." +"\n"+"Su especialidad es: " + especialidad);
    }*/

    public static Set<Integer> obtenerLegajos() {
        return new HashSet<>(legajos);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", especialidad=" + especialidad +
                '}';
    }

}
