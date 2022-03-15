package lesson12;

import java.util.*;

public class ColectionUtilsImp implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> result1 = new ArrayList<>();
        result1.addAll(a);
        result1.addAll(b);
        result1.retainAll(a);
        result1.retainAll(b);
        return result1;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result2 = new HashSet<>();
        result2.addAll(a);
        result2.addAll(b);
        return result2;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> result3 = new HashSet<>();
        result3.addAll(a);
        result3.addAll(b);
        return result3;

    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {

        Collection<Integer> result =new LinkedList<>();
        for(Integer num:a){
            if(!b.contains(num)){
                result.add(num);
            }
        }

        for(Integer num:b){
            if(!a.contains(num)){
                result.add(num);
            }
        }

        result.addAll(a);
        result.addAll(b);

        result.retainAll(b);
        result.removeAll(a);


      return result;







    }
}
