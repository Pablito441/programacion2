package TP_N1.Codigo1;

public class Main {
    public static void main(String[] args) {

        Manager employeePablo = new Manager("Pablo",21,1000000, "Sales");
        Worker employeeBana = new Worker("Bana", 24, 100, "Production");

        employeePablo.work();
        employeeBana.work();

    }
}
