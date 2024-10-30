package model;

import constantes.Especialidades;
import interfaz.IHemograma;
import interfaz.IRayosX;

public class Traumatologo extends Doctor implements IHemograma, IRayosX {
    private int numeroDeCirugiasRealizadas;

    public Traumatologo(String nombre, int legajo, int numeroDeCirugiasRealizadas) {
        super(nombre, legajo, Especialidades.TRAUMATOLOGO);
        this.numeroDeCirugiasRealizadas = numeroDeCirugiasRealizadas;
    }

    @Override
    public void análisisDeSangre() {
        System.out.println("Se esta realizando un analisis de sangre, el mismo fue solicitado por el doctor: " + nombre);
    }

    @Override
    public void realizarPlacas() {

    }
    public void realizarDiagnostico() {
        diagnosticarPaciente();
    }

    public void iniciarTratamiento() {
        tratamientoPaciente();
    }

    @Override
    public String toString() {
        return "Traumatologo{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", especialidad=" + especialidad +
                ", numeroDeCirugiasRealizadas=" + numeroDeCirugiasRealizadas +
                '}';
    }
}
