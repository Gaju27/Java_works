package Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_ListIterator_04 {
    public static void main (String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1 gaju");
        list.add("2 sunil");
        list.add("3 phani");
        list.add("4 vishnu");
        list.add("5 melwin");
        list.add("6 mallela");
        list.add("7 balaji");
        System.out.println("Travesing through LiteIterator");
        ListIterator<String> ltr=list.listIterator(list.size());
        while(ltr.hasPrevious()) {
            String str = ltr.previous();
            System.out.println(str);
        }

        System.out.println("Traversing through for loop");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Traversing through forEach() method");
        list.forEach(a->{
            System.out.println(a);
        });

        System.out.println("Traversing through forEachRemaining() method");
        Iterator itr=list.iterator();

        itr.forEachRemaining(a->{
            System.out.println(a);
        });
    }
}
