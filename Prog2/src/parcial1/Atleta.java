package parcial1;
import java.lang.Math;
public class Atleta extends Persona implements Contrato {
    //Atributos
    private double altura;
    private int edad;
    private double peso;


    //Constructor
    public Atleta(int dni, String nombre, double altura, int edad, double peso) {
        super(dni, nombre);
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
    }
    //getters y setters


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //Métodos implementados de Contrato

    @Override
    public double calculaIMC() {
        //Aca implemento la clase Math para hacer el calculo
        return peso / Math.pow(altura , 2);
    }

    @Override
    public boolean hayPesoExtra() {
        double imc = calculaIMC();
        //Si tiene un umbral de IMC superior a 24.9 se considera sobrepeso
        return imc > 24.9;
    }

    @Override
    public double tomarPulsaciones() {
         //Es una simulacion simple para calcular un porcentaje de las pulsaciones máximas basadas en la edad del atleta
        double pulsacionesBase = 220 - edad;
        return pulsacionesBase * 0.85;
        //sino acá una simulacion random de pulsacion
        //return Math.random()*100;
    }
}
