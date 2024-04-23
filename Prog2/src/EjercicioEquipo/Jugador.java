package EjercicioEquipo;
//1.Crear una clase Jugador con atributos como nombrem posicion, numero de camiseta, etc.
//2. Crea una clase Equipo que tenga una lista de jugadores y que implemente la interfaz Iterable <jugador>
//3. En la clase Equipo, implemnta el método iterador() para devolver un iterador personalizado que recorra la lista de jugadores.
//4. En el método main, crea instancias de clase Jugador, añádelas al equipo y luego itera sobre los jugadores del equipo utilizando un bucle for-each.
class Jugador {
    private String nombre;
    private String posicion;
    private int numeroCamiseta;

    public Jugador(String nombre, String posicion, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                '}';
    }
}
