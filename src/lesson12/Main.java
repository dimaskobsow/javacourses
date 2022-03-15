package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new  LinkedList<Integer>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


    numbers.add(0,111);
    numbers.set(0,222);
    numbers.addLast(6);
    numbers.remove(1);
        System.out.println(numbers);
    }
}
