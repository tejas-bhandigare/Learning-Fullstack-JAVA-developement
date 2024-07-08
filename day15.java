import java.util.Iterator;
import java.util.LinkedList;

public class day15 {

    public static void main(String[] args) {

        // LinkedList

        LinkedList<String> al = new LinkedList<>();

        LinkedList<String> al2 = new LinkedList<>();

        // adding element
        System.out.println("list 1 is : ");
        al.add("Tejas");
        al.add("chetan");
        al.add("mj");
        al.add("sourabh");

        al2.add("Saud");
        al2.add("omkar");
        al2.add("saud");
        al2.add("gourav");
        al2.add("swapnil");
        al2.add("omkar");
        al2.add("gourav");

        // iteration

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        System.out.println("list 2 is : ");

        Iterator<String> itr1 = al2.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());

        }

        // adding element at specific element
        System.out.println("adding element at specific element at index 2 ");
        al.add(2, "Satej");

        System.out.println(al);

        // adding second list element into the first list
        System.out.println("Adding two lists : ");
        al2.addAll(al);
        System.out.println(al2);

        // adding an element at first position
        System.out.println("Adding element at first position : ");
        al.addFirst("abhay");

        System.out.println(al);

        // adding an element at last position

        System.out.println("Adding element at last position : ");
        al.addLast("umair");

        System.out.println(al);

        // removing specific element
        System.out.println("Removing specific element : ");
        al2.remove("omkar");
        System.out.println(al2);

        // removing specific element using index

        System.out.println("Removing element using index : ");
        al2.remove(1);
        System.out.println(al2);

        // removing first element form the list

        System.out.println("Removing first element : ");
        al2.removeFirst();
        System.out.println(al2);

        // removing last element form the list
        System.out.println("Removing last element : ");
        al2.removeLast();
        System.out.println(al2);

        // Removing first occurrence of element form the list

        System.out.println("Removing first occurance : ");
        al2.removeFirstOccurrence("omkar");
        System.out.println(al2);

        // removing last occurance of element form the list

        System.out.println("Removing last occurnace form the list:  ");
        al2.removeLastOccurrence("Gourav");
        System.out.println(al2);

        // clear method

        System.out.println("Remove all the element form the list using clear method()");
        al2.clear();
        System.out.println(al2);

        //Reverse list

        System.out.println("Tranversing the list of element in reverse order : ");
        Iterator i =al.descendingIterator();

        while (i.hasNext()) {
            System.out.print(" " +i.next());
            
        }

    }
}
