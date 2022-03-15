package lesson13.lesson13HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class StringTextConvektor implements ListItils {


    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {
        List<String> listAs =new ArrayList<>();
        listAs.add(String.valueOf(strings));
        return listAs;
    }

    @Override
    public TreeSet<String> sortedList() throws IllegalArgumentException {
        TreeSet<String> listSorted=new TreeSet<>();
        listSorted.add(String.valueOf(listSorted));
        return listSorted;
    }
}
