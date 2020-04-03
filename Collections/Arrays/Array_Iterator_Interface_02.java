package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_Iterator_Interface_02 {
    public static void main(String gaju[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("gaju");
        list.add("sunil");
        list.add("Vivek");
        list.add("modi");
        list.add("phani");
        Iterator itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
