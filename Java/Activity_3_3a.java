import java.util.LinkedList;
import java.util.Queue;
public class Activity_3_3a {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //Add elements
        for (int i=0;i<5;i++) {
            q.add(i);
        }
        //Display queue contents  
        System.out.println("Elements in queue: " + q);
        //To remove the head 
        int removeElement = q.remove();
        System.out.println("removed element: " + removeElement);
        //To view the head 
        int headElement = q.peek();
        System.out.println("head of queue: " + headElement);
        int size = q.size();
        System.out.println("Size of queue: " + size);
    }
}

/*
 * Create a Queue named q. Add first 5 natural numbers to it and print the
 * Queue. Remove a number in the Queue using the remove() method. Peek() at the
 * first number in the Queue after removal. Print the size of the Queue using
 * the size() method. Print the updated Queue.
 */