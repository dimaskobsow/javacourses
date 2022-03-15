package Lesson7;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {

        People people = new People();
        people.age = 22;
        people.name = "Dima";


        People people1 = new People();
        people1.age = 22;
        people1.name = " david";

        People topLeft = new People();
        topLeft.name = " Vlad";
        topLeft.age = 22;

        people.printInfo();
        people1.printInfo();
        topLeft.printInfo();

    }


}

