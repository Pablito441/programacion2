package TP_N3.Ejercicio_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> diasSemana = new ArrayList<>();
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");

        // Insertar en la posición 4 el elemento "Juernes"
        diasSemana.add(4, "Juernes");
        System.out.println("Elemento en la posición 3: " + diasSemana.get(3));
        System.out.println("Elemento en la posición 4: " + diasSemana.get(4));

        // Mostrar el primer y último elemento de la lista
        System.out.println("Primer elemento de la lista: " + diasSemana.get(0));
        System.out.println("Último elemento de la lista: " + diasSemana.get(diasSemana.size() - 1));

        // Eliminar el elemento "Juernes" de la lista y comprobar que haya sido eliminado
        boolean eliminado = diasSemana.remove("Juernes");
        if (eliminado) {
            System.out.println("Elemento 'Juernes' eliminado de la lista.");
        } else {
            System.out.println("Elemento 'Juernes' no encontrado en la lista.");
        }

        // Crear un iterador y mostrar uno a uno los valores de la lista
        System.out.println("Valores de la lista:");
        Iterator<String> iterador = diasSemana.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Buscar si existe en la lista un elemento que se denomine "Lunes"
        boolean contieneLunes = diasSemana.contains("Lunes");
        if (contieneLunes) {
            System.out.println("La lista contiene el elemento 'Lunes'.");
        } else {
            System.out.println("La lista no contiene el elemento 'Lunes'.");
        }

        // Buscar si existe en la lista un elemento que se denomine "Lunes" (sin importar mayúsculas/minúsculas)
        boolean contieneLunesIgnoreCase = diasSemana.stream().map(String::toLowerCase).anyMatch(dia -> dia.equals("lunes"));
        if (contieneLunesIgnoreCase) {
            System.out.println("La lista contiene el elemento 'Lunes' (sin importar mayúsculas/minúsculas).");
        } else {
            System.out.println("La lista no contiene el elemento 'Lunes' (sin importar mayúsculas/minúsculas).");
        }

        // Borrar todos los elementos de la lista
        diasSemana.clear();
        System.out.println("Todos los elementos de la lista han sido eliminados.");
    }
}

