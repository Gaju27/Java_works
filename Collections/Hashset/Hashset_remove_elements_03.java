package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_remove_elements_03 {
    public static void main (String args[]){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("BBMP");
        hashSet.add("COVID19");
        hashSet.add("Corporation");
        hashSet.add("COVID19");
        Iterator iterator = hashSet.iterator();
        System.out.println("Removing duplicates from set:");
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
        hashSet.remove("COVID19");
        System.out.println("After remove method: "+hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("drillbit");
        hashSet1.add("Spartan");
        hashSet.addAll(hashSet1);
        System.out.println("After addAll: "+hashSet);
        hashSet.removeAll(hashSet1);
        System.out.println("After removeAll: "+hashSet);
        hashSet.removeIf(str->str.contains("One"));
        System.out.println("After removeIf:"+hashSet);
        hashSet.clear();
        System.out.println("After clear method: "+hashSet);

    }
}
