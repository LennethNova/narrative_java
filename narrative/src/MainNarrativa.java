import java.util.Scanner;

// Run this
public class MainNarrativa {
    public static void main(String[]args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecicionBinaria();

        MotorNarrativo narrativa = new MotorNarrativo(transicion, dialogo, decision);

        System.out.println("\nScene 1: You found an injured traveler. Do you help him? (A = Yes / B = No)");

        // Option
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nChoose A or B: ");
        String opcionJugador = scanner.nextLine();

        narrativa.ejecutarEscena(opcionJugador);

        scanner.close();
    }
}
