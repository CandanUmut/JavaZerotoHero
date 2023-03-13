package unit02.objects.day08;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increase(double rate){

        salary = rate + salary;
        System.out.println(" Salary raise is "+rate+ "$ dollars and total salary is " + salary +  "$ dollars ");



    }
    public double getSalary(){
        return salary;

    }
}
