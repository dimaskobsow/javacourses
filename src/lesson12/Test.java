package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>arrayList = new ArrayList<>();
        LinkedList<String>arraylist =new LinkedList<>();

        long startArraylistAdd = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
           arraylist.add("asd" + i);
        }
        long endArraylistAdd = System.currentTimeMillis();
        System.out.println("Add ArrayList: "+(endArraylistAdd - startArraylistAdd));
        //////////////////////////////////////////////////////////////////////////////
        long startLinkedlistAdd = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            arraylist.add("asd" + i);
        }
        long endLinkedlistAdd = System.currentTimeMillis();
        System.out.println("Add LinkedList: "+(endLinkedlistAdd - startLinkedlistAdd));
    }
}
