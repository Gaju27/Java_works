package Arrays;

import java.util.ArrayList;

public class Array_isEmpty_09 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("is array empty: "+list.isEmpty());
        list.add("gaju");
        System.out.println("After insertion: ");
        System.out.println("is array empty: " +list.isEmpty());
    }
}
