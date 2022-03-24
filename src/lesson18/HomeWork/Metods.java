package lesson18.HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Metods implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        try {
            if (number1.isEmpty() || number2.isEmpty()) {
            }
            if (number1 == null || number2 == null) {
            }
            double value = Double.parseDouble(number1);
            double value1 = Double.parseDouble(number2);
            double result = value / value1;
            return result;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Empty number1 or number2 - NumberFormatException");
        } catch (NullPointerException n) {
            n.printStackTrace();
            System.out.println("Null number1 or number2 - NullPointerException");
        }
        return 0;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {

        try {
            if (word.isEmpty()) {
                System.out.println("Empty");
            }
            int indexJava = text.indexOf(word); // Нахождение слова в строке
            if (indexJava == -1) {
                System.out.println("Слово" + word + " не найдено.");
            } else {
                System.out.println("Слово" + word + "найдено в индексе " + indexJava);
            }
            return new int[indexJava];
        } catch (NullPointerException n) {
            n.printStackTrace();

        }
        return null;

    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        try {
            if (text.isEmpty()) {

            }
            Matcher m = Pattern.compile("(?!=\\d\\.\\d\\.)([\\d.]+)").matcher(text);
            while (m.find()) {
                double d = Double.parseDouble(m.group(1));
                System.out.println(d);
            }
        } catch (Exception c) {
            c.printStackTrace();
            System.out.println("CustomException - findNumbers");
        }
        return new double[0];
    }
}
