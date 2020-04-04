package Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_01 {
    public static void main(String args[]){
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("One");
        hashSet.add("second");
        hashSet.add("three");
        hashSet.add("four");
        System.out.println("Initial hashset: "+hashSet);
        Iterator itr = hashSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
