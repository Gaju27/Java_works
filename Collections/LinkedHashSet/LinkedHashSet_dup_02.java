package LinkedHashSet;

import Arrays.Student;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_dup_02 {
    public static void main(String[] args){
        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<Student>();
        // Creating students
        Student s1= new Student(1,"achieve", 20,60);
        Student s2 = new Student(1,"success",21,90);
        Student s3= new Student(3,"Winner",20,95);
        // adding a duplicate student details
        Student s4 = new Student(1,"success",21,90);
        linkedHashSet.add(s1);
        linkedHashSet.add(s2);
        linkedHashSet.add(s3);
        Iterator<Student> iterator = linkedHashSet.iterator();
        for(Student obj:linkedHashSet) {
            System.out.println("RollNum: "+obj.rollnum+" Name: "+obj.name+" age :"+obj.age + " marks: "+obj.marks);
        }
    }
}
