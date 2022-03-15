package lesson4.lesson4;

public class Main {
    public static void main(String[] args) {
        // всегда 2 варианта после =
//        String text = new String();// это перввй вариант
//        String text1 = "Hello World";// это второй вариант

        String password = "qWer111ty";
        int paswordLength = password.length();

        if (paswordLength < 8 ){
            System.out.println("пароль слишком коротокий");
            return;//  остановить метод который сейчас выполняется

        }
        // contains проверяет содержит ли цифра или символ или нет
        if(!password.contains("0")&& !password.contains("1")
                && !password.contains("1")
                && !password.contains("2")
                && !password.contains("3")
                && !password.contains("4")
                && !password.contains("5")
                && !password.contains("6")
                && !password.contains("7")
                && !password.contains("8")
                && !password.contains("9")){
            System.out.println("в пароли нет цифры ");
            return;
        }
        // toUpperCase делает заглавные буквы
        String alfabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

        for(int i = 0 ;i< alfabet.length();i++){
            char currentCharFromAlfabet =  alfabet.charAt(i);
            if (password.contains(currentCharFromAlfabet+"")){
                System.out.println("Этог ббольшая буква " +currentCharFromAlfabet);
            }
        }
    }
}
// for (int currentNum : num) // for each  для каждого числа цикл

