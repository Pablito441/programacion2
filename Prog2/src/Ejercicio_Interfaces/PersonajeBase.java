package Ejercicio_Interfaces;

public abstract class PersonajeBase implements Personaje {
    private int nivel;
    private String nombre;
    private int puntosDeVida;
    private int ataque;
    private int defensa;

    public PersonajeBase(int nivel, String nombre, int puntosDeVida, int ataque, int defensa) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de Vida: " + puntosDeVida);
        System.out.println("Ataque: "+ ataque);
        System.out.println("Defensa: "+ defensa);
    }
    public abstract int calcularAtaque();

    public abstract int calcularDefensa();

}
