

import java.util.LinkedList;

public class linked {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        // Add element
        ll.add(10);
        ll.add(20);
        ll.add(30);

        // remove element
        ll.remove();

        // *add element at the start
        ll.addFirst(40);

        // *remove element from end
        ll.removeLast();

        // *get first and get last
        // System.out.println(ll.getFirst());
        // System.out.println(ll.getLast());

        // *add(1 : index, 10 : data)
        ll.add(1, 10);

        // *clear element
        // ll.clear();

        // *checking the particular value
        // System.out.println(ll.contains(10));

        // *get(index)
        // System.out.println(ll.get(1));

        // *get(indexOf)
        // System.out.println(ll.indexOf(10));

        // *size of the linked list
        // System.out.println(ll.size());



        
    }
}
