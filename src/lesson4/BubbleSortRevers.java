package lesson4;
//сортировка пузырьком
public class BubbleSortRevers {
    public static void main(String[] args) {


        int[] arrayM = {2, 3, 4, 5, 6, 7};

        boolean inSort = false;
        int save = 0;

        while (!inSort) {
            inSort = true;
            for (int i = 0; i < arrayM.length - 1; i++) {
                if (arrayM[i] < arrayM[i + 1]) {
                    inSort = false;

                    save = arrayM[i];
                    arrayM[i] = arrayM[i + 1];
                    arrayM[i + 1] = save;

                }
            }
        }

        for (int i = 0; i < arrayM.length; i++) {
            System.out.println(arrayM[i]);

        }
    }
}
