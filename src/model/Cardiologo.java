package model;

import constantes.Especialidades;
import interfaz.IHemograma;

import java.util.HashSet;

public class Cardiologo extends Doctor implements IHemograma {
    private int numeroDePacientes;

    public Cardiologo(String nombre, int legajo, int numeroDePacientes) {
        super(nombre, legajo, Especialidades.CARDIOLOGO);
        this.numeroDePacientes = numeroDePacientes;
    }

    @Override
    public void análisisDeSangre() {
        System.out.println("Se esta realizando un analisis de sangre, el mismo fue solicitado por el doctor: " + nombre);
    }

    /*
    public void realizarDiagnostico() {
        diagnosticarPaciente();
    }

    public void iniciarTratamiento() {
        tratamientoPaciente();
    }*/

    @Override
    public void diagnosticarPaciente() {
        System.out.println("El paciente esta siendo diagnosticado por: " + nombre + "\n" + "Su especialidad es: " + especialidad);
    }

    @Override
    public void tratamientoPaciente() {
        System.out.println("El Doctor " + nombre + " recomendo pastillas para el corazon." + "\n" + "Su especialidad es: " + especialidad);
    }

    @Override
    public String toString() {
        return "Cardiologo{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", especialidad=" + especialidad +
                ", numeroDePacientes=" + numeroDePacientes +
                '}';
    }
}
