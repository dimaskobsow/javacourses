package lesson2.HomeWork;

import java.util.Scanner;

public class Kalendar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какой день вы выбрали ?");

        int num = in.nextInt();

        if(num>=1&&num<3){
            System.out.println("Этот день из 1 недели ");
        }else if(num>=3&&num<10){
            System.out.println("Этот день из 2 недели ");
        }else if(num>=10&&num<17){
            System.out.println("Этот день из 3 недели ");
        }else if(num>=17&&num<24){
            System.out.println("Этот день из 4 недели ");
        }else if(num>=24&&num<31){
            System.out.println("Этот день из 5 недели ");
        }else{
            System.out.println("В календаре нету такого дня ");
            in.close();
        }






    }
}
