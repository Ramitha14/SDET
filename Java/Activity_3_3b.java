import java.util.*;
public class Activity_3_3b {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<String>();
        //Add elements 
        dq.add("Lion");
        dq.addFirst("Monkey");
        dq.addLast("Wolf");
        //Alternate way to add elements to queues
        dq.offer("Zebra");
        dq.offerFirst("Giraffe");
        dq.offerLast("Panda");
        //Iterate through the queue elements.
        Iterator<String> iterator = dq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //Peek at head element
        System.out.println("Peek: " + dq.peekFirst());
        System.out.println("Peek: " + dq.peekLast());
        //To show that the element have not been deleted
        System.out.println("After peek: " + dq);      
        //Search for element
        System.out.println("Contains Wolf?: " + dq.contains("Wolf"));
        //Remove the first and last element
        dq.removeFirst();
        dq.removeLast();
        System.out.println("dq after removing first and last elements: " + dq);
        System.out.println("Size of deque after removal: " + dq.size());
    }
}


/*
 * Create a Deque named dq. Add any 6 animals to it. Use the Iterator interface
 * to iterate through the deque and print the values in the queue. Peek() at the
 * head element and the tail element of the queue. Check if there is a Wolf
 * present in the queue using the contains() method. Remove() the first and last
 * element from the queue. Print the size() of the queue after removal.
 */

/*
 * Other ways of adding and removing elements in queues are: Adding elements
 * offer(element): Adds an element to the tail and returns a boolean
 * offerFirst(element): Adds an element to the head and returns a boolean
 * offerLast(element): Adds an element to the tail and returns a boolean
 * Removing elements poll(): Retrieves and removes the head of the queue
 * represented by this deque or returns null if this deque is empty.
 * pollFirst(): Retrieves and removes the first element of this deque, or
 * returns null if this deque is empty. pollLast(): Retrieves and removes the
 * last element of this deque, or returns null if this deque is empty.
 */