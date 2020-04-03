package Arrays;

import java.util.ArrayList;

public class Array_get_set_10 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("gaju");
        list.add("sunil");
        list.add("phani");
        System.out.println("list values: "+list);
        System.out.println("before update: "+list.get(1));
        list.set(1,"Gajanana");
        System.out.println("After update: "+list.get(1));
        System.out.println("list values: "+list);
    }
}
