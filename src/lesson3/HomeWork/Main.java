package lesson3.HomeWork;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int shift = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int n = 0; n < numbers.length; n++) {
                // убираем первый элемент в буфер, а на его место ставим хвостовой элемент
                int buffer = numbers[0];
                numbers[0] = numbers[numbers.length - 1];

                // циклично сдвигаем весь массив
                for (int j = 1; j < numbers.length - 1; j++) {
                    numbers[numbers.length - j] = numbers[numbers.length - j - 1];
                }

                // ставим буферный элемент в 1 ячейку
                numbers[1] = buffer;
              //  System.out.print(numbers[i]);
            }
            System.out.print(numbers[i]);
        }
    }
}
