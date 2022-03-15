package lesson3.HomeWork;

public class Main1 {
    public static void main(String[] args) {
        // sum of all cells # 1


//        int sum = 0;
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//
//        }
//        System.out.print(sum);

        // more even or odd numbers # 2

//        int even = 0;
//        int odd = 0;
//        int[] numbers={1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                even = i;
//            } else {
//                odd = i;
//            }
//        }
//
//        if (even < odd) {
//            System.out.print("четных больше");
//        } else {
//            System.out.print("нечетных больше");
//        }

        // the average of the array
//        int sum = 0;
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }
//        System.out.println(sum/ numbers.length);

        //

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] array = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i + 1 >= numbers.length) {
                array[i + 1 - numbers.length] = numbers[i];
            } else {
                array[i + 1] = numbers[i];
            }
        }
        for (int i : array) {
            System.out.print(i);


        }

    }
}
