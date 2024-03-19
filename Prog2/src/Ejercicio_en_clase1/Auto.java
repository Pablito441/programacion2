package Ejercicio_en_clase1;

public class Auto extends Vehiculo{
    private boolean descapotable;

    public Auto(String duenio, int puertas, int ruedas, boolean descapotable) {
        super(duenio, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public void caracteristicas() {
        System.out.println("Dueño: "+getDuenio());
        System.out.println("Puertas: "+getPuertas());
        System.out.println("Ruedas: "+getRuedas());
        if (isDescapotable()){
            System.out.println("Descapotable: "+isDescapotable());
        }
    }
}
