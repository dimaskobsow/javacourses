package Lesson7.HomeWork;

public class Main {




    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.id = 1;
        employee.position = "supervisor";
        employee.age = 33;
        employee.name = "Ivan";
        employee.salary = 100.000;
        employee.PrintIfoEmployee();
        employee.addSalary();



        System.out.println('\n');

        Employee employee1 = new Employee();
        employee1.id = 2;
        employee1.position = "Manager";
        employee1.age = 25;
        employee1.name = "Vlad";
        employee1.salary = 50.000;
        employee1.PrintIfoEmployee();
    }


}
