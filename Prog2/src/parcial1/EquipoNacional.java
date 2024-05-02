package parcial1;

import java.util.ArrayList;

public class EquipoNacional {
//Atributos
    private String color;
    private String pais;
    private ArrayList<Atleta> atletas;


//Contructor
    public EquipoNacional(String color, String pais) {
        this.color = color;
        this.pais = pais;
        this.atletas = new ArrayList<>();
    }


//getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }


//Métodos
    public void agregarAtleta(Atleta atleta){
        atletas.add(atleta);
    }
    public void mostrarAlturaAtletas(){
        for (Atleta atleta : atletas){
            System.out.println(atleta.getNombre() + " tiene una altura de "+ atleta.getAltura() + " metros.");
        }
    }

    public void mostrarPesoExtraAtletas() {
        for (Atleta atleta : atletas) {
            double imc = atleta.calculaIMC();
            if(atleta.hayPesoExtra()){ //utilizamos el metodo para verificar si tienen peso extra
                double pesoExtra = (imc - 24.9) * Math.pow(atleta.getAltura(), 2); // Calculamos el peso extra en kg
                System.out.println(atleta.getNombre() + " tiene un peso extra de: " + pesoExtra + " kg.");
            } else {
                System.out.println(atleta.getNombre() + " no tiene peso extra.");
            }

        }
    }





}
