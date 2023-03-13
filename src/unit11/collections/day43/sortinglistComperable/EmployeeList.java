package unit11.collections.day43.sortinglistComperable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        List<Employee> employeeList =new ArrayList<>();

        employeeList.add(new Employee("John",33,1200001));
        employeeList.add(new Employee("Kimberly",33,12000));
        employeeList.add(new Employee("Kevin",33,120000));

        System.out.println("Employee sorted by name");
        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(Employee::getName).reversed());
        System.out.println(employeeList);

        System.out.println("Employee sorted by salary");
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println(employeeList);
        System.out.println("Employee sorted by salary in reverse");
        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(employeeList);

        System.out.println("Employee sorted byage ");
        employeeList.sort(Comparator.comparing(Employee::getAge));
        System.out.println(employeeList);

    }
}
