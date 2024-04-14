package Ejercicio_relaciones_9_4.Composicion;
import java.util.ArrayList;
import java.util.List;

class Casa {
    private List<Puerta> puertas;

    public Casa(int numPuertas) {
        puertas = new ArrayList<>();
        for (int i = 0; i < numPuertas; i++) {
            puertas.add(new Puerta("Madera"));
        }
    }

    public List<Puerta> getPuertas() {
        return puertas;
    }

    public void mostrarPuertas() {
        System.out.println("Materiales de las puertas de la casa:");
        for (int i = 0; i < puertas.size(); i++) {
            System.out.println("Puerta " + (i + 1) + ": " + puertas.get(i).getMaterial());
        }
    }
}