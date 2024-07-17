package day19_set;
import java.util.*;
public class day19_Treeset {
    public static void main(String[] args) {
        // Creating a Set object and declaring it of String type with reference to TreeSet     
        Set<String> ts = new TreeSet<String>();
        // Adding elements into the TreeSet using add()       
        ts.add("abc");
        ts.add("xyz");
        ts.add("klm");
        // Adding the duplicate  element       
        ts.add("abc");
        // Displaying the TreeSet
        System.out.println("Display added element");
        System.out.println(ts);
        // Removing items from TreeSet using remove()      
        ts.remove("xyz");
        System.out.println("Set after removing " + "xyz:" + ts);               
        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }}
