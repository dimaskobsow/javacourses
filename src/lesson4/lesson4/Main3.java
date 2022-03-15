package lesson4.lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("какую фигуру по считаем ?");
        System.out.println("1 - квадрат");
        System.out.println("2- треугольник ");
        System.out.println("3 - круг");
        System.out.println("4 -овал");
        System.out.println("5 - паралелелограм");

        String figura = scanner.nextLine();

        System.out.println("что посчитать ?");
        System.out.println("1 - площадь");
        System.out.println("2 - периметр");

        String action = scanner.nextLine();


        if (figura.equalsIgnoreCase("квадрат") || figura.equals("1")) {

            System.out.println("введите в сторону квадрата ");
            String storona = scanner.nextLine();
            int a = Integer.parseInt(storona);

            if (action.equalsIgnoreCase("площадь") || action.equals("1")) {
                System.out.println("площадь квадрата " + (a * a));
            } else {
                System.out.println("периметр квадрата " + (a * 4));
            }

            if (figura.equalsIgnoreCase("треугольник") || figura.equals("2\n" +
                    "            if (action.equalsIgnoreCase(\"площадь\") || action.equals()) {\n" +
                    "                System.out.println(\"площадь квадрата \" + (a * a));\n" +
                    "            } else {\n" +
                    "                System.out.println(\"периметр квадрата \" + (a * 4));")) {


            }
            if (figura.equalsIgnoreCase("круг") || figura.equals("3")) {


            }
            if (figura.equalsIgnoreCase("овал") || figura.equals("4")) {


            }
            if (figura.equalsIgnoreCase("паралелепипод") || figura.equals("5")) {


            }
            //System.out.println(figura);
        }
    }
}
