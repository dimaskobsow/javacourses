package lesson3.lesson3;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4,5,6};
//        numbers[3]=33;
//        System.out.println(numbers[2]);
//        int[] nums2=new int[6];// нужно указывать длинну

//        int[] numbers = {1, 2, 3, 4, 5, 6};// numbers.length размер длинны выберает автоматически
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }
        // вывести с конца в начало через одну

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i = numbers.length - 1; i >= 0; i = i - 2) {
//            System.out.println(numbers[i]);
//        }


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = numbers.length - 1; i >= 0;  i --) {
            if(numbers[i]%2!=0)
                System.out.println(numbers[i]);

        }
    }
}
