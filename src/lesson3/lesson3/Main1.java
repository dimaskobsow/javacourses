package lesson3.lesson3;

public class Main1 {
    public static void main(String[] args) {
//        int money = 100000;
//        int rate = 7;
//        int years = 9;
//
//        for(int year= 0;year < years;years++){
//            for(int month=0;month<12;month++){
//                money=money+((money/100*rate)/12);
//                System.out.println(money);
//            }
//        }

        int [] numbers = new int [7];
        int value = 0;
        for(int i = 0;i < numbers.length;i++){
//            numbers[0]=10;
//            numbers[1]=12;
//            numbers[2]=14;
//            numbers[3]=16;
//            numbers[4]=18;
//            numbers[5]=20;
//            numbers[6]=22;
            numbers[i]=value;
            value = value +2;

            System.out.println(value);
        }

    }
}
