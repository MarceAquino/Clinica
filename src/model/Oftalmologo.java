package model;

import constantes.Especialidades;

public class Oftalmologo extends Doctor {
    private int numeroTelefono;

    public Oftalmologo(String nombre, int legajo, int numeroTelefono) {
        super(nombre, legajo, Especialidades.OFTALMOLOGO);
        this.numeroTelefono = numeroTelefono;
    }

    public void fondoDeOjos() {
        System.out.println("Se esta realizando un fondo de ojos, el mismo fue solicitado por el doctor: " + nombre);
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
        System.out.println("El Doctor " + nombre + " recomendo gotas para los ojos." + "\n" + "Su especialidad es: " + especialidad);
    }

    @Override
    public String toString() {
        return "Oftalmologo{" +
                "nombre='" + nombre + '\'' +
                ", legajo=" + legajo +
                ", especialidad=" + especialidad +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}
