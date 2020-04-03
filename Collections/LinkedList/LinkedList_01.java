package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_01 {
    public static void main(String args[]) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("Gaju");
        llist.add("Sunil");
        llist.add("Phani");
        Iterator<String> iterator = llist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
