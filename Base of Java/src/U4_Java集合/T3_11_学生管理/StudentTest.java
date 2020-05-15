package U4_Java集合.T3_11_学生管理;

import java.util.HashSet;
import java.util.Iterator;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(3, "William", 65);
        Student s2 = new Student(1, "Tom", 87);
        Student s3 = new Student(2, "Lucy", 95);

        HashSet set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s3);

        Iterator it = set.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s);
        }
    }
}
