package LinkedList;

import java.util.LinkedList;

public class LinkedList_remove_elements_03 {
    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Gaju");
        linkedList.add("Leone");
        linkedList.add("gaju");
        linkedList.add("gaju");
        linkedList.add("sunil");
        linkedList.add("kiran");
        linkedList.add("vivek");
        linkedList.add("Sunny");
        linkedList.add("rahul");
        linkedList.add("usha");
        linkedList.add("Sunny");
        linkedList.add("usha");
        linkedList.add("Leone");
        System.out.println("Initial LinkedList: "+linkedList);
        linkedList.remove("gaju");
        System.out.println("After remove() method: "+linkedList);
        linkedList.remove(2);
        System.out.println("After removing index location element: "+linkedList);
        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("phani");
        linkedList1.add("raj");
        linkedList.addAll(linkedList1);
        System.out.println("After adding linkedlist1 to linkedlist:"+linkedList);
        linkedList.removeAll(linkedList1);
        System.out.println("After removing linkedlist1 from linkedlist:"+linkedList);
        linkedList.removeFirst();
        System.out.println("After removeFirst: "+linkedList);
        linkedList.removeLast();
        System.out.println("After removeLast: "+linkedList);
        linkedList.removeFirstOccurrence("Leone");
        System.out.println("After removeFirstOccurrence: "+linkedList);
        linkedList.removeLastOccurrence("Sunny");
        System.out.println("After removeLastOccurrence:"+linkedList);
    }
}
