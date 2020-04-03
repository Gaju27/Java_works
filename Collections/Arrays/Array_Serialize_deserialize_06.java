package Arrays;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static java.lang.System.*;

public class Array_Serialize_deserialize_06 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Gaju");
        list.add("Sunil");
        list.add("Phani");
        try {
            // Serialization
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();

            // Deserialization
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list1 = (ArrayList) ois.readObject();
            out.println(list1);
        } catch (Exception e) {
            out.println(e);
        }
    }
}
