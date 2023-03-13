package unit02.objects.day08;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Umut", 150);

        System.out.print("Salary is " + employee1.getSalary() +"$");
        employee1.increase(3366);
        System.out.println(employee1.getSalary());
    }
}
