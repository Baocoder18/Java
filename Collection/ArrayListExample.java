package Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Student> listStudent = new ArrayList<>();
        Student s1 = new Student("A", 10);
        Student s2 = new Student("B", 10);
        Student s3 = new Student("C", 10);

        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }
}
