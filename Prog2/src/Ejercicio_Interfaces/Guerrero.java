package Ejercicio_Interfaces;

public class Guerrero extends PersonajeBase {
    public Guerrero(int nivel, String nombre, int puntosDeVida) {
        super(nivel, nombre, puntosDeVida, 25, 10);
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
        return getAtaque();
    }

    @Override
    public int defender(int damage) {
        setPuntosDeVida(getPuntosDeVida() -getDefensa() - damage);
        return getPuntosDeVida();
    }
}
