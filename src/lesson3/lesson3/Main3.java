package lesson3.lesson3;

public class Main3 {
    public static void main(String[] args) {
        String name = "Alex";
        char[] simvols = name.toCharArray();// команда массимов символов
        for ( int i = 0; i < simvols.length;i++){
            if(simvols[i]=='a'||simvols[i]== 'o'|| simvols[i]=='e'){
                System.out.println(simvols[i]);
            }
        }
    }
}
