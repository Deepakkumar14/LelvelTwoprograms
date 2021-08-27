package intersectionunion;

import java.util.ArrayList;
import java.util.List;

public class IntersectionUnion {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<Integer>();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(9);
        List<Integer> list2=new ArrayList<Integer>();
        list2.add(1);
        list2.add(5);
        list2.add(8);
        list2.add(9);
        list2.add(2);
        List<Integer> union=new ArrayList<>();
        union.addAll(list1);
        union.addAll(list2);
        System.out.println("Union of list1 and list2"+union);
        list1.containsAll(list2);
    }
}
