import java.util.*;
import java.util.PriorityQueue;
public class day17 {
    public static void main(String[] args) {      
        PriorityQueue<String> queue= new PriorityQueue<>();
        //using add() method adding element in queue
        System.out.println("Using add()  method I have added the element in Queue");
        queue.add("tejas");
        queue.add("satej");
        queue.add("mj");
        queue.add("chetan");
        queue.add("sourabh");
        System.out.println(queue);
        //iterate the array 
        System.out.println("using Iterator we can displays elements of queue");
        Iterator itr= queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());          
        }
       //using peek() finding peek element
        System.out.println("peek element is : "+ queue.peek());

        //remove() method remove head element of queue.
        System.out.println("using remove() method we can remove head of queue");
        queue.remove();
        System.out.println(queue);

    }
}
