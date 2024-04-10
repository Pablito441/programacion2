package TP_N1.Codigo1;

public class Manager extends Employee{
    private String departament;

    public Manager(String name, int age, double salary, String departament) {
        super(name, age, salary);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public void work() {
        System.out.println( getName() + " is organizing activities in the "+ getDepartament() +" department.");
    }
}
