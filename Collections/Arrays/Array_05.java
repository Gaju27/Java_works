package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_05 {
    public static void main(String args[]){
        Student s1= new Student(1,"Student1",10,90);
        Student s2 = new Student(2,"Student2",11,93);
        Student s3 = new Student(3,"Student3",9,99);
        // Creating array list of student type
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        // now call Iterator to iterate through list of students
        Iterator itr=students.iterator();
        while (itr.hasNext()) {
//            System.out.println(itr.next());
            Student st=(Student)itr.next();
            System.out.println(st.rollnum+" "+st.name+" "+ st.age+" "+st.marks);
        }

    }
}
