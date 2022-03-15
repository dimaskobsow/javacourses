package lesson3;

public class WhileMain {
    public static void main(String[] args) {

        boolean b= false ;

          int i;
          for(i = 0;i<10;i++){
              if(i==9){
                  b=true;
              }
        }
          while(b){
              System.out.println(i + "менешь 9");
              break;
          }
    }
}
