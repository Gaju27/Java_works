package Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset_anothe_coll_04 {
    public static void main(String args[]){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Array 01");
        arrayList.add("Array 02");
        arrayList.add("Array 03");
        // add a duplicate element here
        arrayList.add("Array 01");

        // Use array list to Hashset
        HashSet<String> hashSet = new HashSet(arrayList);
        hashSet.add("Gaju");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
