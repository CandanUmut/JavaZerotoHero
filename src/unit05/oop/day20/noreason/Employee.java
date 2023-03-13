package unit05.oop.day20.noreason;

public class Employee {
    private String id;
    private int salary;
    private boolean isManager;
    private String name;


    public Employee(String id, int salary, boolean isManager, String name) {
        this.id = id;
        this.salary = salary;
        this.isManager = isManager;
        this.name = name;
    }
    public Employee(){
        id="Hayri";
        salary= 25000;
        isManager=false;
        name="Hayri";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary=" + salary +
                ", isManager=" + isManager +
                ", name='" + name + '\'' +
                '}';
    }public String getColor(){
        return name;
    }
}
