package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_reverse_list_04 {
    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("malayalam");
        linkedList.add("2020");
        linkedList.add("Geetha");
        linkedList.add("Sadhu kokila");
        System.out.println("Initial LinkedList: "+linkedList);
        Iterator itr=linkedList.descendingIterator();
        while (itr.hasNext()) {
            System.out.println("Reversing: "+itr.next());
        }

    }
}
