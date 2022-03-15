package Lesson6.HWMetod;

import java.util.Arrays;

public class Metods {
    public static void main(String[] args) {
        String[] Photo = {"image.png", "image.jpg", "image.jpeg", "image.png"};
        String stroka = "Ниже посмотрите будет рассмотрен пример иллюстрирующий синтаксис ";

        int result = numberLine(stroka);
        System.out.println(result);

        String test = replaces(stroka);
        System.out.println(test);

        String[] string1 = photoExtensions(Photo);
        System.out.println(Arrays.toString(string1));

    }

    // считает количество слов в строке
    static int numberLine(String line) {
        int count = 0;
        if (line == null) {
            System.out.println("Нету слов в строке ");
        }
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    //метод меняет О на А
    static String replaces(String repl) {
        String s = null;
        int count = 0;
        for (int i = 0; i < repl.length(); i++) {
            s = repl.replaceAll("о", "a");
            count++;
        }
        return s;
    }

    public static String[] photoExtensions(String[] array) {
        int countPng = 0;
        int countJpg = 0;
        int countJpeg = 0;
        String[] resultArray = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].endsWith("png")) {
                countPng++;
            } else if (array[i].endsWith("jpg")) {
                countJpg++;
            } else if (array[i].endsWith("jpeg")) {
                countJpeg++;
            }
        }
        String[] arrJpeg = new String[countJpeg];
        String[] arrJpg = new String[countJpg];
        String[] arrPng = new String[countPng];

        // здесь проверка сравнения каунтовых переменных
        for (int i = 0, j = 0; i < array.length; i++) {
            if (countPng > countJpeg && countPng > countJpg) {
                if (array[i].endsWith(".png")) {
                    arrPng[j] = array[i];
                    resultArray = arrPng;
                    j++;
                } else if (countJpg > countPng && countJpg > countJpeg) {
                    if (array[i].endsWith(".jpg")) {
                        arrJpg[j] = array[i];
                        resultArray = arrJpg;
                        j++;
                    } else if (countJpeg > countJpg && countJpeg > countPng) {
                        if (array[i].endsWith(".jpeg")) {
                            arrJpeg[j] = array[i];
                            resultArray = arrJpeg;
                            j++;
                        }
                    }
                }
            }
        }
        return resultArray;
    }


}
