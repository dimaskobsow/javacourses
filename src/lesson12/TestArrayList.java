package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String>arrayList = new ArrayList<>();
        LinkedList<String>linkedList =new LinkedList<>();

        long startArraylistAdd = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
           arrayList.add("asd" + i);
        }
        long endArraylistAdd = System.currentTimeMillis();
        System.out.println("Add ArrayList: "+(endArraylistAdd - startArraylistAdd));
        //////////////////////////////////////////////////////////////////////////////
        long startLinkedlistAdd = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            linkedList.add("asd" + i);
        }
        long endLinkedlistAdd = System.currentTimeMillis();
        System.out.println("Add LinkedList: "+(endLinkedlistAdd - startLinkedlistAdd));


        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(3);//добавили в массив
        numbers.add(5);//
        numbers.add(7);//
        numbers.add(0,111);//добавит на 0 индекс
        numbers.set(0,222);//заменяет на 0 индекс
        numbers.contains(222);//имеется ли такое число
        System.out.println(numbers.contains(222));//
        numbers.stream().toList();
        System.out.println(numbers.stream().toList());
        //////////////////////////////////////////////////////////////////////////////
        System.out.println("/////////////////////////////////////////////////////////////");

        long startArraylistGet = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            arrayList.get( i);
        }
        long endArraylistGet = System.currentTimeMillis();
        System.out.println("Get ArrayList: "+(endArraylistGet - startArraylistGet));
        //////////////////////////////////////////////////////////////////////////////
        long startLinkedlistGet = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            linkedList.get(i);
        }
        long endLinkedlistGet = System.currentTimeMillis();
        System.out.println("Get LinkedList: "+(endLinkedlistGet - startLinkedlistGet));
    }
}
