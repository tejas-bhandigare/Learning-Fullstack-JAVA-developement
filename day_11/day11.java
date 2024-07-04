package day_11;
public class day11 {
    
    public static void main(String[] args) {

        //define string as generics
        
        Box<String> box = new Box<String> ("hello");

        System.out.println(box.getValue());
        System.out.println();
    }
}
