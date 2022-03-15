package lesson3;

public class ForMain {
    public static void main(String[] args) {

        for(int i = 0;i<10;i++){
            if(i==5){
                continue;
            }
            if(i==7){
                continue;
            }
            if(i==9){
                break;
            }
            System.out.println(i);//0,1,2,3,4,6,8
        }
    }
}
