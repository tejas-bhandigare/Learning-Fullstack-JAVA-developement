package day19_set;
import java.util.*;
public class day19_sortedset {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<String>();
        // Adding elements
        hash.add("x");
        hash.add("Y");
        hash.add("Z");
        System.out.println(hash);
        // Accessing elements
        String check = "Y";
        System.out.println("Contains " + check + " " + hash.contains(check));
        // Removing elements
        hash.remove("Z");
        System.out.println(hash);
        // Iterating elements
        for (String value : hash)
        // Printing all the values inside the object
        System.out.print(value + ", ");
        System.out.println();
    }
}
