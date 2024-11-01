package model;

import constantes.Especialidad;
import interfaz.IHemograma;
import interfaz.IRayosX;

public class Traumatologo extends Doctor implements IHemograma, IRayosX {
    private int numeroDeCirugiasRealizadas;

    public Traumatologo(String nombre, int legajo, int numeroDeCirugiasRealizadas) {
        super(nombre, legajo, Especialidad.TRAUMATOLOGO);
        this.numeroDeCirugiasRealizadas = numeroDeCirugiasRealizadas;
    }

    @Override
    public void análisisDeSangre() {
        System.out.println("Se esta realizando un analisis de sangre, el mismo fue solicitado por el doctor: " + nombre);
    }

    @Override
    public void realizarPlacas() {
        System.out.println("El traumatogo esta realizando placas");
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
        System.out.println("El Doctor " + nombre + " recomendo pastillas para el dolor muscular." + "\n" + "Su especialidad es: " + especialidad);
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
