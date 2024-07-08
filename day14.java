import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class day14 {

    public static void main(String[] args) {
        // List methods

        List<Integer> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(1);

        list2.add("kiwi");
        list2.add("papaya");
        list2.add("Mango");
        list2.add("Apple");

        // .get()
        System.out.println("Geting no. that is present in give index '0' .");
        System.out.println("list is " + list);
        System.out.println(list.get(0));

        // set()

        System.out.println("we can change the element with set()");
        list.set(1, 1000);
        System.out.println(list);

        // add()
        System.out.println("Adding element in list");
        list.add(0, 50);
        System.out.println(list);

        // remove()
        System.out.println("Removing an elemnt form list using index");
        list.remove(1);
        System.out.println(list);

        // indexof()

        System.out.println("Find the index of give element");
        System.out.println(list.indexOf(1000));

        // iterator

        // for loop
        for (int i = 0; i < list2.size(); i++) {

            System.out.println("Fruit is " + list2.get(i));

        }

        // for each loop

        for (String fruit : list2) {
            System.out.println("for each fruit : " + fruit);
        }

        // iterator

        Iterator<String> fe = list2.iterator();
        while (fe.hasNext()) {
            System.out.println("iterator " + fe.next());
        }

        // sublist

        List<String> smallList = list2.subList(0, 2);
        System.out.println(smallList);

    }
}
