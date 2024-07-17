package day19_set;
import java.util.*;
public class day19_hashset {
    public static void main(String[] args) {
        Set<String> hash = new HashSet<String>();
        hash.add("tejas");
        hash.add("chetan");
        hash.add("mj");
        hash.add("pankaj");
        hash.add("om");
        hash.add("sourabh");
       // trying to add duplicate element in set
        hash.add("tejas");
        System.out.println(hash);
        //remove
        System.out.println("Remove the element in set using remove()");
        hash.remove("om");
        System.out.println(hash);
        //iterating though iterator
        System.out.println("Using Iterator display the elements");
        Iterator<String> i = hash.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());           
       }
    }
}
