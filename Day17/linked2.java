// import java.util.LinkedList;

public class linked2 {
    private Node head;
    private Node tail;

    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(int data) {
        Node curr = new Node(data);
        if (head == null) {
            head = curr;
            tail = curr;
        }
            tail.next = curr;
            tail = curr;
        
    }

    // public int remove() {
    // Node curr = tail;
    // Node itr = head;
    // if (head == null)
    // return -1;
    // if (head.next == null) {
    // head = null;
    // tail = null;
    // }
    // while (itr.next.next != null) {
    // itr = itr.next;
    // }
    // itr.next = null;
    // tail = itr;

    // return curr.data;
    // }

    // public int size() {
    // if (head == null)
    // return 0;
    // Node itr = head;
    // int count = 0;
    // while (itr != null) {
    // count++;
    // itr = itr.next;
    // }
    // return count;
    // }

    // public void addFirst(int data) {
    // Node curr = new Node(data);
    // if (head == null) {
    // head = curr;
    // tail = curr;
    // }
    // curr.next = head;
    // head = curr;

    // // return curr.data;
    // }

    // public void addLast(int data){
    // Node curr = new Node(data);
    // if (head == null) {
    // head = curr;
    // tail = curr;
    // }
    // tail.next = curr;
    // tail = curr;
    // }

    // public void clear(){
    // this.head = null;
    // this.tail = null;
    // }

    // public static void reverseLL(Node head){
    // if(head.next == null || head == null){
    // return;
    // }
    // Node prev;
    // Node curr;
    // Node right;

    // prev = null;
    // curr = head;
    // right = head.next;

    // while(curr != null){
    // curr.next = prev;
    // curr = right;
    // right = curr.next;
    // }
    // head = curr;
    // }

       // Sum method
       public int sum() {
        int sum = 0;
        Node curr = head;
        while (curr != null) {
            sum += curr.data;
            curr = curr.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        linked2 ll = new linked2();
        ll.add(4);
        ll.add(6);
        ll.add(9);
        System.out.println("LinkedList: " + ll);

        System.out.println("Sum of elements: " + ll.sum());
    }
}
