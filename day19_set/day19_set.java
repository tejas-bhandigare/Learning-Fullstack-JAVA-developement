package day19_set;
import java.util.*;   
public class day19_set{   
    public static void main(String[] args)   
    {   
        // creating LinkedHashSet using the Set  
        Set<String> data = new LinkedHashSet<String>();   
        System.out.println("Adding element in set using add()");
        data.add("JavaTpoint");   
        data.add("Set1");   
        data.add("Example");   
        data.add("Set"); 
        data.add("sub");
        data.add("add");            
        System.out.println(data);  
        //remove()
        System.out.println("remove element in set using the remove()");
        data.remove("Set");
        System.out.println(data);
        // I have created here two sets to perform operations
        System.out.println("set operations");       
        Set<Integer> a = new HashSet<Integer>();     
        // Adding all elements to List 
        a.addAll(Arrays.asList(
            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));     
      // Again declaring object of Set class  with reference to HashSet     
        Set<Integer> b = new HashSet<Integer>();        
        b.addAll(Arrays.asList(
            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));      
        // To find union of two sets
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
        // To find intersection of two sets
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);        
    }   
}   