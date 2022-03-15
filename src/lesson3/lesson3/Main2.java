package lesson3.lesson3;
import static java.lang.System.out;


public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        for (int day = 0; day < 365; day++) {
            for (int hour = 0; hour < 24; hour++) {
                for (int minut = 0; minut < 60; minut++) {
                    for (int second = 0; second < 60; second++) {
                        out.printf ("со дня прошло:%d дня ,%d часа ,%d минут,%d секунд.\n", day,hour,minut,second);
                        Thread.sleep(1000);

                    }
                }
            }
        }
    }
}
//System.out.println("со дня прошло:%d дня ,%d часа ,%d минут,%d секунд.\n", day, hour,

