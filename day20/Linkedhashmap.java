import java.util.*;
class Student {int id;String name, City;int marks;
    public Student(int id, String name, String city, int marks) {
        this.id = id;
        this.name = name;
        this.City = city;
        this.marks = marks;
    }
}
public class Linkedhashmap {
    public static void main(String[] args) {
        Map<Integer, Student> map = new LinkedHashMap<Integer, Student>();
        // createing a student records
        Student s1 = new Student(1001, "Tejas Bhandigare", "kolhapur", 85);
        Student s2 = new Student(1002, "Satej BHandigare", "ichalkarnji", 88);
        Student s3 = new Student(1003, "Shree", "pune", 90);
        // ADDING STUDENT TO THE MAP
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);
        // traversing map
        for (Map.Entry<Integer, Student> entry : map.entrySet()) {
            int key = entry.getKey();
            Student s = entry.getValue();
            System.out.println(key + "Details: ");
            System.out.println(s.id + " " + s.name + " " + s.City + " " + s.marks);
        }

    }
}
