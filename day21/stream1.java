package day21;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.*;

public class stream1 {
    public static void main(String[] args) {
        // Creating an ArrayList object of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Inserting elements to ArrayList class object Custom input integer numbers
        al.add(2);
        al.add(3);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);
        System.out.println("Printing the collection : " + al);    
        // Stream operations
        // 1. Getting the stream from this collection
        // 2. Filtering out only even elements
        // 3. Collecting the required elements to List
        List<Integer> ls = al.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());        
        System.out.println("Printing the List after stream operation : " + ls);

        //date 
        LocalDate date = LocalDate.now();
        System.out.println("current date is :" + date);

        //time
        LocalTime time1 = LocalTime.now();
        System.out.println("the current time is " +  time1);
            
        
 
                            
                       
    }
}
