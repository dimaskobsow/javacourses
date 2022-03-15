package Lesson8;

public class Wheel {
    int radius;
    String marka;
    String rubber;//резина

    Wheel(int rad, String m, String ru) {
        radius = rad;
        marka = m;
        rubber = ru;
        System.out.println("Создалось колесо " + radius + " marka " + marka + " " + rubber );
    }


}
