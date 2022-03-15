package Lesson8;

public class Person {
    String name;
    Car car;
    BankAccount ba;
    static int count = 0;

    Person() {
        count++;
    }

    void setName(String n) {
        name = n;
    }

    void setCar(Car c) {
        car=c;
    }
    void setBankAccount(BankAccount b){
        ba=b;
    }

    void printInfo() {
        System.out.println(" My names " + name + " у моей машины цвет " + car.color
                + " Motor " + car.engine + " this my nomer check " + ba.idAccount
                + " на нем " + ba.countMoney);
    }
}

class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Dima";
        Wheel wheel = new Wheel(19, "Mishlen", "Lipuchka");
        Car car = new Car("blu", "v10", wheel);
        Car car1 = new Car( "black","V6",wheel);
        BankAccount bankAccount = new BankAccount(12345, 5000);
        person.car = car;
        person.ba = bankAccount;
        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setCar(car1);
        BankAccount bankAccount1 = new BankAccount();
        person1.setBankAccount(bankAccount1);

        person.printInfo();

        System.out.println(Person.count);
    }
}