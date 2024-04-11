package Ejercicio_Interfaces;

public class Mago extends PersonajeBase {
    public Mago(int nivel, String nombre, int puntosDeVida) {
        super(nivel, nombre, puntosDeVida, 15, 20);
    }

    @Override
    public int calcularAtaque() {
        return getNivel() * getAtaque();
    }

    @Override
    public int calcularDefensa() {
        return getNivel() * getDefensa();
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public int defender(int damage) {
        setPuntosDeVida(getPuntosDeVida() -getDefensa() - damage);
        return getPuntosDeVida();
    }
}
