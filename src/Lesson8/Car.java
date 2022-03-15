package Lesson8;

public class Car {
    String color;
    String engine;
    Wheel wheel;

    Car() {
    }

    Car(String c, String e, Wheel w) {
        color = c;
        engine = e;
        wheel = w;
        System.out.println("Создаем обьект типа Car");
    }


}

class TestCar {
    public static void main(String[] args) {

        Car bmw = new Car();
        Car Mersedes = new Car();
        Car kia = new Car();

//         bmw.color="red";
//         bmw.engine="V8";
//         System.out.println(bmw.color+" "+bmw.engine);

    }
}
