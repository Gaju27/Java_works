package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_ignore_dup_02 {
    public static void main (String args[]){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Unique");
        hashSet.add("Duplicate");
        hashSet.add("duplicate");
        hashSet.add("Duplicate");
        hashSet.add("unique");
        hashSet.add("Unique");
        System.out.println("initial Hashset: "+ hashSet);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
