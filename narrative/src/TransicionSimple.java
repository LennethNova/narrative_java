import java.util.Scanner;
// Interfaces
interface TransicionHistoria {
    void avanzarEscena();
}

interface GestorDialogo {
    void mostrarDialogo(String texto);
}

interface LogicaDecision {
    boolean tomarDecision(String opcion);
}

// Implement
class TransicionSimple implements TransicionHistoria {
    @Override
    public void avanzarEscena() {
        System.out.println("\nNext scene transition");
    }
}

class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String texto) {
        System.out.println("\n" + texto);
    }
}

class DecicionBinaria implements LogicaDecision {
    @Override
    public boolean tomarDecision(String opcion) {
        // Yes or no = A or B
        return opcion.equalsIgnoreCase("A");
    }
}