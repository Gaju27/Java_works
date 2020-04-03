package LinkedList;

import java.util.LinkedList;

public class LinkedList_add_elements_02 {
    public static void main(String args[]) {
        LinkedList<String> llist = new LinkedList<>();
        llist.add("Gaju");
        llist.add("sunil");
        System.out.println("Initialization of Linked List: " +llist);
        llist.add(0,"Gajanana");
        System.out.println("After addition to index location: "+llist);
        LinkedList<String> llist1= new LinkedList<>();
        llist1.add("Melwin");
        llist1.add("Balaji");

        llist.addAll(llist1);
        System.out.println("After invoking addAll: "+llist);
        llist.addFirst("Gajanana Ganjigatti");
        System.out.println("After Invoking addFirst: "+llist);
        llist.addLast("Sunil M Patil");
        System.out.println("After invoking addLast: "+llist);

    }
}
