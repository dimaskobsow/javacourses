package lesson18.HomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CustomException {

        String number1 = "11.11";
        String number2 = "2.2";
        Metods metods = new Metods();
        System.out.println(metods.div(number1,number2));


        String str = "Привет, java - программист!";
        Metods metods1 = new Metods();
        System.out.println(Arrays.toString(metods1.findWord(str, " java ")));


        String str1 = "This is whole 5, and that is double 11.95, now a fraction .25 and finally another whole 3. with a trailing dot!";
        Metods metods2 = new Metods();
        System.out.println(Arrays.toString(metods2.findNumbers(str1)));





    }
}
