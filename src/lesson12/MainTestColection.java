package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MainTestColection {
    public static void main(String[] args) {

        LinkedList<Integer> a = new LinkedList<>();
        if ((a == null))
            throw new NullPointerException("a==Null");
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        HashSet<Integer> b = new HashSet<>();
        if ((b == null))
            throw new NullPointerException("b==Null");
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);

        ColectionUtilsImp utilsImp = new ColectionUtilsImp();
        Collection<Integer> union = utilsImp.union(a, b);
        System.out.println(union);
        System.out.println("**************************************************************");

        LinkedList<Integer> a2 = new LinkedList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);

        HashSet<Integer> b2 = new HashSet<>();
        b2.add(4);
        b2.add(5);
        b2.add(6);
        b2.add(1);


        ColectionUtilsImp colectionUtilsImp = new ColectionUtilsImp();
        Collection<Integer> colection = colectionUtilsImp.intersection(a2, b2);
        System.out.println(colection);

        //        Set<Integer> intersection = new HashSet<>(a2);
//        intersection.retainAll(b2);
//        System.out.println(intersection);


        System.out.println("**************************************************************");

        HashSet<Integer> a1 = new HashSet<>();
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);

        HashSet<Integer> b1 = new HashSet<>();
        b1.add(3);
        b1.add(7);
        b1.add(8);
        b1.add(9);

        ColectionUtilsImp utilsImp2 = new ColectionUtilsImp();
        Set<Integer> union2 = utilsImp2.unionWithoutDuplicate(a1, b1);
        System.out.println(union2);
        System.out.println("**************************************************************");


        LinkedList<Integer> a3 = new LinkedList<>();
        a3.add(6);
        a3.add(7);
        a3.add(8);
        a3.add(9);

        HashSet<Integer> b3 = new HashSet<>();
        b3.add(5);
        b3.add(3);
        b3.add(8);
        b3.add(9);

        ColectionUtilsImp intersection1 = new ColectionUtilsImp();
        Set<Integer> integerSet = intersection1.intersectionWithoutDuplicate(a3, b3);
        System.out.println(integerSet);
        System.out.println("**************************************************************");


        LinkedList<Integer> a4 = new LinkedList<>();
        a4.add(1);
        a4.add(2);
        a4.add(3);
        a4.add(4);


        LinkedList<Integer> b4 = new LinkedList<>();
        b4.add(1);
        b4.add(2);
        b4.add(3);
        b4.add(5);

        Collection<Integer> diff = new LinkedList<>();

        System.out.println();
        System.out.println("**************************************************************");
    }
}
