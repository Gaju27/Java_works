package Arrays;

import java.util.ArrayList;

public class Array_for_loop_03 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Gaju");
        list.add("Sunil");
        list.add("melwim");
        list.add("balaji");
        list.add("Tanaji");
        for (String obj:list)
            System.out.println(obj);
    }
}
