import java.util.Vector;

public class day16vector {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<String>();
        Vector<Integer> in = new Vector<>();
        // Adding element using add() method.
        System.out.println("Adding element in vec Vector using a add() method");
        vec.add("Tejas");
        vec.add("satej");
        vec.add("Mj");
        vec.add("chetan");
        System.out.println(vec);
        //Adding element usig the add() method.
        in.add(100);
        in.add(200);
        in.add(300);
        in.add(400);
        in.add(500);
        in.add(600);
        in.add(700);
        System.out.println(in);
        // Adding element using addElement() method of vector
        System.out.println("After adding element using the addElement() method ");

        vec.addElement("sourabh");
        vec.addElement("mangesh");

        System.out.println(vec);

        // Check size and capacity
        System.out.println("Size is: " + vec.size());

        // Display Vector elements
        System.out.println("Vector element is: " + vec);
        vec.addElement("Raj");
        vec.addElement("Ram");
        vec.addElement("Deepak");

        // Again check size and capacity after two insertions
        System.out.println("Size after addition: " + vec.size());

        // Display vector element again
        System.out.println("Elements are: " + vec);

        // checking the element is present or not

        System.out.println("Check the elelment sourabh is present or not ");
        if (vec.contains("sourabh")) {
            System.out.println("Sourabh is present ");
        } else {
            System.out.println("sourabh is not present.");
        }

        // geting the first element
        System.out.println("The first name is : " + vec.firstElement());

        // geting the last element
        System.out.println("The last element is : " + vec.lastElement());


        // perfom action on in vector

        //use remove() method element in the vector 

        System.out.println(in);

        System.out.println("Remove the first occurence of 300" + in.remove((Integer)200));

        System.out.println("After removing the element the vector is : ");

        System.out.println(in);

        //using remove mehtod remove the element from the element 

        System.out.println("Removeing the element at index 4 :  "+ in.remove(4));
        System.out.println(in);

        //remove element using element 

        in.removeElementAt(2);
        System.out.println(in);

        //Get the hashcode for this vector  
        System.out.println("Hash code of this vector = "+in.hashCode());

        //Get the element at specified index  
        System.out.println("Element at index 1 is = "+in.get(1)); 
        
        
    }
}
