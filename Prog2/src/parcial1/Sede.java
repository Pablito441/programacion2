package parcial1;

import java.util.ArrayList;

public class Sede {
//Atributos
    private int fase;
    private String fecha;
    private String hora;
    private ArrayList<Prueba> pruebas;
    private ArrayList<Instalacion> instalaciones;


//Contructores
    public Sede(int fase, String fecha, String hora, Instalacion instalacion) {//Se inicializa una instalacion por lo menos para que se cumpla la multiplicidad de 1 a Muchos (1..*)
        this.fase = fase;
        this.fecha = fecha;
        this.hora = hora;
        this.pruebas = new ArrayList<>();
        this.instalaciones = new ArrayList<>();
        this.instalaciones.add(instalacion); //Agrego directamente la instalacion al ArrayList instalaciones
    }

    //Este constructor para validar que se puede crear una sede con muchas instalaciones, ya que la multiplicidad es de 1..*
    public Sede(int fase, String fecha, String hora, ArrayList<Instalacion> instalaciones) {
        this.fase = fase;
        this.fecha = fecha;
        this.hora = hora;
        this.pruebas = new ArrayList<>();
        this.instalaciones = instalaciones;
    }
//getters and setters

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ArrayList<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public ArrayList<Instalacion> getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(ArrayList<Instalacion> instalaciones) {
        this.instalaciones = instalaciones;
    }

    //Métodos
    public void AgregarPruebas(Prueba prueba){
        pruebas.add(prueba);
    }
    public void AgregarInstalaciones(Instalacion instalacion){
        instalaciones.add(instalacion);
    }
}
