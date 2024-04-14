package Ejercicio_relaciones_9_4.Agregacion;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pablo", "Gerente");
        Empleado empleado2 = new Empleado("María", "Contador");


        Departamento departamento1 = new Departamento("Ventas");
        departamento1.agregarEmpleado(empleado1);
        departamento1.agregarEmpleado(empleado2);

        Empresa empresa = new Empresa("Mi Empresa");
        empresa.agregarDepartamento(departamento1);

        // Mostrar lista de empleados de cada departamento
        System.out.println("Empleados del departamento " + departamento1.getNombre() + " de la empresa " + empresa.getNombre() + ":");
        for (Empleado empleado : departamento1.getEmpleados()) {
            System.out.println("- Nombre: " + empleado.getNombre() + ", Cargo: " + empleado.getCargo());
        }
    }
}