package lesson4.HomeWork;

public class Fibonachi {
    public static void main(String[] args) {


        int[] intArray = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Maximum number = " + maxNum);


        int result = 0;
        for (int m : intArray) {
            result += m;
        }
        System.out.println("Среднее арифмитическое = " + result / intArray.length);

            // число фиббоначе
        int[] fibonachi = new int[10];
        for (int i = 0; i < fibonachi.length; i++) {
            if (i < 2) fibonachi[i] = 1;
            else fibonachi[i] = fibonachi[ i-1] + fibonachi[i-2];
            System.out.print(fibonachi[i] + " ");
        }
    }


}

