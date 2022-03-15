package lesson3.HomeWork;

public class Timetable {
    public static void main(String[] args) {

        int week = 7;
        int minute = 59;
        int hour = 24;

        String monday = "Понедельник";
        String tuesday = "Вторник";
        String wednesday = "Среда";
        String thursday = "Четверг";
        String friday = "Пятница";
        String saturday = "Суббота";
        String sunday = "Воскресенье";


        OUTER:
        for (int i = 0; i < hour; i++) {
            if (i <= 6) {
                System.out.println(" сплю " + i + " час");
                continue;

            }
            if (i == 7) {
                System.out.println("Проснулся в 7 утра иду завтракать");
                continue;
            }
            if (i <= 8 && i == 8) {
                System.out.println("Иду на работу до 16:00  на работе");
                continue;
            }
            if (i <= 16 && i == 16) {
                System.out.println("закончил работать  до занятия в 19:30");
            }
            if (i == 19) {
                System.out.println("Учеба на Джаве ");
                continue;
            }
            if (i <= 22 && i == 22) {
                System.out.println("Заканчился урок еду домой ");
                continue;
            }
            if (i == 23) {
                System.out.println("Ложусь в 23:00 спать и завтра снова все по кругу");
                continue;
            }

            INNTER:
            for (int j = 0; j <= minute; j++) {
                System.out.println("Час" + " " + i + " " + "минута" + " " + j + " " + " " + monday);

            }

        }
    }
}




