package Ejercicio_Interfaces;

public class Picaro extends PersonajeBase {

    public Picaro(int nivel, String nombre, int puntosDeVida) {
        super(nivel, nombre, puntosDeVida, 20, 15);
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
