package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_01 {
    public static void main(String args[]){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("1 Added");
        linkedHashSet.add("2 Added");
        linkedHashSet.add("3 Added");
        linkedHashSet.add("0 Added");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
