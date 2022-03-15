package Lesson9;

public class TestDog {
    public static void main(String[] args) {

        Dog dog =new Dog();
        dog.say();
        dog.name="Sharic";
        dog.age = 2;


        System.out.println(dog.toString());


    }
}
