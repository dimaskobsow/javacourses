package lesson17;
//copy with files
//copy with byte
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CopyWithOneByte oneByte = new CopyWithOneByte();
        long starTime = System.currentTimeMillis();
        try {
            oneByte.copy("/Users/dimaskobsow1508gmail.com/Downloads/365days.mp4", "/Users/dimaskobsow1508gmail.com/Movies/365days1.mp4");

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("CopyWithOneByte  - " + (endTime - starTime));

        System.out.println("------------------------------------------------------------");

        CopyWithFiles withFiles = new CopyWithFiles();
        long starTime1 = System.currentTimeMillis();
        try {
            withFiles.copy("/Users/dimaskobsow1508gmail.com/Downloads/365days.mp4", "/Users/dimaskobsow1508gmail.com/Movies/365days1.mp4");

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("CopyWithFiles  - " + (endTime1 - starTime1));

        System.out.println("------------------------------------------------------------");

        CopyWithGuava withGuava = new CopyWithGuava();
        long starTime2 = System.currentTimeMillis();
        try {
            withGuava.copy("/Users/dimaskobsow1508gmail.com/Downloads/365days.mp4", "/Users/dimaskobsow1508gmail.com/Movies/365days1.mp4");

        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("CopyWithGuava  - " + (endTime2 - starTime2));
    }
}