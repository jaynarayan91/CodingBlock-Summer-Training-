public class Queue {

    private int arr[];
    private int start;
    private int end;
    private int currSize;
    private int maxSize;

    // Creating Constructor
    public Queue() {
        arr = new int[5];
        start = -1;
        end = -1;
        currSize = 0;
    }

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }

    // inserting element to queue
    public void enqueue(int newElement) {
        if (currSize == maxSize) {
            System.out.println("Queue is full\n");
            System.exit(0);
        }
        if (end == 1) {
            start = 0;
            end = 0;
        } else {
            end = (end + 1) % maxSize;
            arr[end] = newElement;
            currSize++;
        }
    }

    // Removing an element from queue
    public int dequeue() {
        if (start == -1) {
            System.out.println("Queue is empty\n");
            System.exit(0);
        }
        int dequeued = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxSize;
            currSize--;
        }
        return dequeued;
    }

    // Top of the element in queue
    public int top() {
        if (start == -1) {
            System.out.println("Queue is empty\n");
            System.exit(0);
        }
        return arr[start];
    }

    // checkSize of queue
    public int checkSize() {
        return currSize;
    }

    // Our queue is empty or not!
    public boolean isEmpty() {
        return (start == -1);
    }

    // Display the created queue
    public void displayQueue() {
        if (start == -1) {
            System.out.println("Queue is empty\n");
        } else {
            System.out.println("Queue is: ");
            for (int i = start; i != end; i = (i + 1) % maxSize) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[end]);
        }
    }

}
