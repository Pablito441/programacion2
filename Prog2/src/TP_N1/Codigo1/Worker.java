package TP_N1.Codigo1;

public class Worker extends Employee{
    private String area;

    public Worker(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void work() {
        System.out.println( getName() + " is producing in the "+ getArea() +" area.");
    }

}
