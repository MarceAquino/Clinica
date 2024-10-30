package model;

import constantes.Especialidades;
import interfaz.IAtencionInfantil;
import interfaz.IHemograma;

public class Pediatra extends Doctor implements IHemograma, IAtencionInfantil {

    public Pediatra(String nombre, int legajo) {
        super(nombre, legajo, Especialidades.PEDIATRA);
    }

    @Override
    public void evaluarCrecimiento() {
        System.out.println("El especialista en: " + especialidad + " esta realizando una evaluacion del crecimiento" );
    }

    @Override
    public void análisisDeSangre() {
        System.out.println("Se esta realizando un analisis de sangre, el mismo fue solicitado por el doctor: " + nombre);
    }
    public void realizarDiagnostico() {
        diagnosticarPaciente();
    }

    public void iniciarTratamiento() {
        tratamientoPaciente();
    }
    @Override
    public String toString() {
        return "Pediatra{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", especialidad=" + especialidad +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
