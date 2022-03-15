package lesson2.lesson2;

public class Main {
    public static void main(String[] args) {


        //упаравляющая конструкция if else
        // 8й примитивный тип bool(true/false)
        // boolean x = 5>8;
        // логические операторы (< , > , <= , >= , ==, != )
        // математические операторы ( + , - , * , / ,)
        // обьедение выражение (||- или, &&- и)

        int a = 7;
        int b = 6;
        int c = 5;

        if (a == b && b == c && c == a) {
            System.out.println("это раВностороний треугольник ");
        }
        else if (a != b && b != c && c != a) {
            System.out.println("это раЗностороний треугольник ");
        } else if ((a == b && b != c && c != a) || (a != b && b == c && c != a) || (a != b && b != c && c == a))
            System.out.println("это равнобедренный треугольник");


    }
}
