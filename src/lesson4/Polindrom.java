package lesson4;

public class Polindrom {
    public static void main(String[] args) {
        int[] polindrom = {22,44,3,1,3,44,22,};

        boolean isPolindrom=false;

        for (int i = 0, j = polindrom.length-1; i < polindrom.length; i++, j--) {
                if(polindrom[i]!=polindrom[j]){
                    isPolindrom=false;
                }else{
                    isPolindrom=true;
                }
        }
        if(isPolindrom){
            System.out.println(" this is Polindrom");
        }else{
            System.out.println("This is not Polindrom");
        }
    }
}
