package lesson2.HomeWork;

public class Main {

    public static void main(String[] args) {
        //все нечетные цифры от 7 до 30
        for (int i = 7; i <= 30; i++) {
            if (i % 2 == 1)

                System.out.println(i);

        }
        System.out.println("   ");
        // от 30 до 0
        for (int i = 30; i >= 0; i--) {
            if (i % 2 == 1)

                System.out.println(i);

        }
        System.out.println("   ");
        // от 40 до 100 которые делятся на 3 и на 5
        for (int i = 40; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i);
        }
        System.out.println("   ");
        // сумму цифр от 1 до 10
        for (int i = 1; i <= 10; i++) {
            i=10 * (10 + 1) / 2;
            System.out.println(i);
        }

        System.out.println("   ");
        // сумму четных чисел от 100 до 150
        int count= 0;
        for (int i = 100; i <= 150; i++) {
            if (i % 2 == 0) {
                count += i;
            }


        } System.out.println(count);
    }
}
