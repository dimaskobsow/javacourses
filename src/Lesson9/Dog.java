package Lesson9;



public class Dog extends Animal {


    @Override
    void say() {
        System.out.println("GGAAAV Gaaavv");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
