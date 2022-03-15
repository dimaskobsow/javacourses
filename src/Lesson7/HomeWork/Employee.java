package Lesson7.HomeWork;

public class Employee {
    public int id;
    public String name;
    public int age;
    public String position;
    public double salary;
    private double netSalary;

    void PrintIfoEmployee() {
        System.out.print(" ID - " + id + '\n' + " Name - " + name + '\n' + " Age - " + age + '\n' + " Possition - " + position + '\n' + " Sallaary - " + salary);

    }

    public void addSalary(){
        double netSalary = salary * ( salary / 100);
       double result = netSalary + salary;
        System.out.println((result));
    }


}
