class MotorNarrativo {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MotorNarrativo(TransicionHistoria t, GestorDialogo d, LogicaDecision l) {
        this.transicion = t;
        this.dialogo = d;
        this.decision = l;
    }

    public void ejecutarEscena(String opcionJugador) {
        if (decision.tomarDecision(opcionJugador)) {
            dialogo.mostrarDialogo("You have chosen to help the unknown traveler.");
        } else {
            dialogo.mostrarDialogo("You continue your adventure ignoring the unknown traveler.");
        }
        transicion.avanzarEscena();
    }

}
