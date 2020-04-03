package Arrays;

import java.util.ArrayList;

public class Array_remove_elements_08 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.add("sixth");
        System.out.println("Initial Array list elements: "+list);
        // remove by specific element
        list.remove("third");
        System.out.println("After removing by value: "+list);
        // remove by index position
        list.remove(2);
        System.out.println("After removing from index position: "+list);

        //create another array
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("seventh");
        list1.add("eighth");
        // now add list1 to list
        list.addAll(list1);
        System.out.println("after addition of list1 to list: "+list);
        // removing all the elements form list1
        list.removeAll(list1);
        System.out.println("After removing all the elements list1 from list: "+list);
        // removing specific location with value present
        list.removeIf(str->str.contains("second"));
        System.out.println("After invoking removeIf method: "+list);
        list.clear();
        System.out.println("Invoking clear method : "+list);
    }
}
