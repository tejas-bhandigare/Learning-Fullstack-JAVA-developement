// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

public class day13 {

    // collection methods
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 =new ArrayList<>();


        // add method in list
        list.add(10);
        list.add(20);
        list.add(30);

        //add methos for list 2
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(30);
        
        System.out.println("List1 is "+list);
        
        System.out.println("List 2 is "+list2);     

        // size
        System.out.println("Size of Array is " + list.size());

        //contain
        System.out.println(list.contains(20));

        //remove
        list.remove(2);
        System.out.println(list);

        //Add all element of another list
        list.addAll(list2);
        System.out.println(list);

        // //removeAll()
        // list.removeAll(list2);
        // System.out.println(list);

        //retainAll()

        list.retainAll(list2);
        System.out.println(list);

        //clear()
        list.clear();
        System.out.println(list);


        //convert list into Array 
        // Object a[]=list.toArray();



        

    }
}
