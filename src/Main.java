import model.*;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {


        System.out.println("********************************");
        System.out.println("\n" + "Se crea correctamente" + "\n");
        System.out.println("********************************");
        try {
            Cardiologo cardiologo = new Cardiologo("Marcos", 150, 10);
            System.out.println(cardiologo);
            cardiologo.análisisDeSangre();
            cardiologo.realizarDiagnostico();
            cardiologo.iniciarTratamiento();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("********************************");
        System.out.println("\n" + "No se permiten legajos identicos" + "\n");
        System.out.println("********************************");
        try {
            Traumatologo Traumatologo = new Traumatologo("Marcos", 150, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("********************************");
        System.out.println("\n" + "No se permiten numeros en el nombre" + "\n");
        System.out.println("********************************");
        try {
            Cardiologo cardiologo2 = new Cardiologo("Marcos1", 150, 10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("********************************");
        System.out.println("\n" + "Resto de test" + "\n");
        System.out.println("********************************");
        try {
            Traumatologo traumatologo = new Traumatologo("Ruben", 151, 10);
            System.out.println(traumatologo);
            traumatologo.realizarPlacas();
            traumatologo.iniciarTratamiento();
            traumatologo.realizarDiagnostico();
            traumatologo.análisisDeSangre();
            System.out.println("********************************");
            Oftalmologo oftalmologo = new Oftalmologo("Carla", 200, 1100502038);
            System.out.println(oftalmologo);
            oftalmologo.fondoDeOjos();
            System.out.println("********************************");
            Pediatra pediatra = new Pediatra("Luis", 120);
            System.out.println(pediatra);
            pediatra.evaluarCrecimiento();
            System.out.println("********************************");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
