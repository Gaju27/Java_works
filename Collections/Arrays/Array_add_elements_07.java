package Arrays;

import java.util.ArrayList;

public class Array_add_elements_07 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Initial list"+list);
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println("After adding list elements: "+list);
        // adding to specific location
        list.add(1,"fourth");
        System.out.println("After adding to specific location: "+list);

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Fifth");
        list1.add("Sixth");
        // now add list1 elements to specific in list
        list.addAll(1,list1);
        System.out.println("After adding list1 elements to list: "+list);


    }
}
