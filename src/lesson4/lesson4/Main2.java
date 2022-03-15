package lesson4.lesson4;

public class Main2 {
    public static void main(String[] args) {
        String email = "sdknd@c.com";
        //split режет массив
        String[] partOfEmail =  email.split("@");
        if(partOfEmail.length !=2){
            System.out.println("Здесь не одна собачка или ее вообще ее нет ");
            return;// чтоб дальше проверок не было
        } // fn f4 посмотреть функционал
        if (email.startsWith(".")||email.endsWith(".")){

        }
    }
}

