import java.util.ArrayDeque;
import java.util.Deque;
public class day18 {
    public static void main(String[] args) {       
        Deque<String> deque = new ArrayDeque<>();
        //uing offer() method i have added the elements in deque
        System.out.println("Using offer() method I have added the elements in deque");
        deque.offer("TEJA");
        deque.offer("Satej");
        deque.offer("parthemsh");
        deque.offer("mj");
        System.out.println(deque);       
        System.out.println("Trvesing the elements in deque");//traversing element
        for(String str:deque){
            System.out.println(str);   }     
        // using pollfirst it will remove the first element in deque
        System.out.println("use of pollfirst");
        deque.pollFirst();
        System.out.println(deque);   
        //using polllast() it will delete the last element in the deque
        System.out.println("use of polllast()");
        deque.pollLast();
        System.out.println(deque);
        //display the head element of the deque
        System.out.println("head of deque");
        System.out.println(deque.peek());       
        System.out.println("Dispaly the LAST elememt of deque");//peaklast()
        System.out.println(deque.peekLast());
    }
}
