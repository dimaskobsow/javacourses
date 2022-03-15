package lesson13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>strings =new LinkedList<>();
        strings.add(4);//добавляет по очереди в массив
        strings.add(3);
        strings.add(2);
        strings.add(1);

        System.out.println(strings);

        TreeSet<String> strings1 = new TreeSet<>();
        strings1.add("ggg");// нету дублткатов
        strings1.add("bbb");//сортирует
        strings1.add("ccc");
        strings1.add("ddd");
        strings1.add("iii");
        System.out.println(strings1);

        TreeSet<Integer> strings2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        strings2.add(9);
        strings2.add(3);
        strings2.add(8);
        strings2.add(6);
        System.out.println(strings2);


    }
}
