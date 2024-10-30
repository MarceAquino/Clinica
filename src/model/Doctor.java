package model;

import constantes.Especialidades;

import java.util.HashSet;
import java.util.Set;

public abstract class Doctor {

    protected String nombre;
    protected int legajo;
    protected Especialidades especialidad;
    private static final Set<Integer> legajos = new HashSet<>();

    public Doctor(String nombre, int legajo, Especialidades especialidad) {
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


    protected void diagnosticarPaciente() {
        System.out.println("El paciente esta siendo diagnosticado por: " + nombre +"\n"+"Su especialidad es: " + especialidad);
    }

    protected void tratamientoPaciente() {
        System.out.println("El Doctor " + nombre +" recomendo reposo como parte del tratamiento." +"\n"+"Su especialidad es: " + especialidad);
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
