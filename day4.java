
//Defining a Student class.  
class day {
    // defining fields
    int id;// field or data member or instance variable
    String name;

    // creating main method inside the Student class
    public static void main(String args[]) {
        // Creating an object or instance
        day4 s1 = new day4();// creating an object of Student
        // Printing values of the object
        // System.out.println(s1.id);// accessing member through reference variable
        // System.out.println(s1.name);
    }
}
class Teacher {
    String designation = "Teacher";
    String college = "Beginnersbook";
    void does(){
     System.out.println("Teaching");
    }
 }
 public class day4 extends Teacher{
    String mainSubject = "Maths";
    public static void main(String args[]){
       day4 obj = new day4();
       System.out.println(obj.college);
       System.out.println(obj.designation);
       System.out.println(obj.mainSubject);
       obj.does();
    }
 }