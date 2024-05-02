package parcial1;

import java.util.ArrayList;

public class Prueba {
//Atributos
    private int codigo;
    private String titulo;
    private ArrayList<Atleta> participantes;
    private Sede sede;
//Constructores
    public Prueba(int codigo, String titulo,Atleta atleta) {//Se inicializa un atleta por lo menos para que se cumpla la multiplicidad de 1 a Muchos (1..*)
        this.codigo = codigo;
        this.titulo = titulo;
        this.participantes = new ArrayList<>();
        this.participantes.add(atleta); //Agrego directamente el atleta al ArrayList participantes
    }


    //Este constructor para validar que se puede crear una prueba con muchos participantes, ya que la multiplicidad es de 1..*
    //Solo que en el main no voy a hacer el ejemplo de creacion como con Sede
    public Prueba(int codigo, String titulo, ArrayList<Atleta> participantes) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.participantes = new ArrayList<>();
        this.participantes = participantes;
    }

//getter and setters
    public ArrayList<Atleta> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Atleta> participantes) {
        this.participantes = participantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    //Métodos
    public void agregarParticpantes(Atleta atleta){
        participantes.add(atleta);

    }


}
