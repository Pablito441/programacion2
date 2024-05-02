package parcial1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Crear las instancias


        Instalacion instalacion = new Instalacion("Circuito de tierra", "Ciudad", "Estadio de Fernanfloo", "Al aire libre");
        Instalacion instalacion1 = new Instalacion("Circuito de asfalto", "Ciudad", "Estadio 1", "Al aire libre");
        Instalacion instalacion2 = new Instalacion("Circuito de tierra pesada", "Ciudad", "Estadio 2", "Indoor");

        //ArrayList para poder crear la Segunda sede con muchas intalaciones
        ArrayList<Instalacion> instalaciones = new ArrayList<Instalacion>();
        instalaciones.add(instalacion);
        instalaciones.add(instalacion1);
        instalaciones.add(instalacion2);

        //sede con al menos una instalacion
        Sede sede = new Sede(1, "2024-04-20", "10:00",instalacion);
        //sede con muchas intalaciones
        Sede sede2 = new Sede(1, "2024-04-20", "10:00", instalaciones);

        Atleta atleta1 = new Atleta(44403734, "Pablo", 1.73, 21, 60);
        Atleta atleta2 = new Atleta(44403333, "Bananirou", 1.62, 30, 70);
        Atleta atleta3 = new Atleta(44402222, "Milei", 1.70, 31, 85);
        //pruebas con almenos un participante como dice en el diagrama uml (1..*)
        Prueba primeraPrueba = new Prueba(1, "Carrera",atleta1);
        Prueba segundaPrueba = new Prueba(2, "Salto",atleta1);

        EquipoNacional equipo = new EquipoNacional("Rojo", "Argentina");

        //Asociar Intalacion y pruebas a Sede
        instalacion.setSede(sede);
        instalacion1.setSede(sede);
        instalacion2.setSede(sede);
        primeraPrueba.setSede(sede);
        segundaPrueba.setSede(sede);

        //Agregar las pruebas a Sede respetando la asociacion
        sede.AgregarPruebas(primeraPrueba);
        sede.AgregarPruebas(segundaPrueba);
        sede2.AgregarPruebas(primeraPrueba);
        sede2.AgregarPruebas(segundaPrueba);

        // Agregar atletas a las pruebas
        primeraPrueba.agregarParticpantes(atleta2);
        primeraPrueba.agregarParticpantes(atleta3);

        segundaPrueba.agregarParticpantes(atleta2);
        segundaPrueba.agregarParticpantes(atleta3);

        // Agregar atletas al equipo nacional
        equipo.agregarAtleta(atleta1);
        equipo.agregarAtleta(atleta2);
        equipo.agregarAtleta(atleta3);

        //Mostrar el nombre del 3er atleta de la 2da prueba desde Instalacion.
        System.out.println("\nEl nombre del tercer atleta de la segunda prueba es " + instalacion.getSede().getPruebas().get(1).getParticipantes().get(2).getNombre() + ".");

        //Mostrar el Código de la 2da prueba desde una instalación.
        System.out.println("\nEl código de la prueba de " + instalacion.getSede().getPruebas().get(1).getTitulo() + " (segunda prueba) es " + instalacion.getSede().getPruebas().get(1).getCodigo() );

        //Mostrar altura de todos los atletas desde el Equipoc nacional
        System.out.println("\nAltura de todos los atletas del Equipo Nacional:");
        equipo.mostrarAlturaAtletas();

        //Mostrar el peso extra de cada atleta desde el Equipo nacional
        System.out.println("\nPeso extra de cada atleta del Equipo Nacional:");
        equipo.mostrarPesoExtraAtletas();

    }
}
