package Lesson9;

public class TestSetAndGet {
    public static void main(String[] args) {
        Departmen departmen = new Departmen();

        departmen.setName("Dima");
        departmen.setMinSalary(100);
        departmen.setMaxSalary(500);

        Employee[] employee = new Employee[5];
        Employee employee1 = new Employee("Ivan", "Ivanow", "Devoloper", 22, 150);
        Employee employee2 = new Employee("Petr", "Petrov", "Sales", 23, 160);
        Employee employee3 = new Employee("ELena", "ELena", "HR", 24, 170);
        Employee employee4 = new Employee("Masha", "Mashena", "Manager", 25, 180);
        Employee employee5 = new Employee("Dima", "Dmitriev", "Devoloper", 26, 190);

        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[3] = employee4;
        employee[4] = employee5;
        departmen.setEmployees(employee);


        System.out.println(departmen.toString());



    }

}
