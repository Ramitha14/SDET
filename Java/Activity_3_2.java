import java.util.HashSet;
public class Activity_3_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("K");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("K");
        hs.add("Z");      
        //Print HashSet
        System.out.println("Original HashSet: " + hs);        
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());       
        //Remove element
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        //Remove element that is not present
        if(hs.remove("Y")) {
        	System.out.println("Y removed from the Set");
        } else {
        	System.out.println("Y is not present in the Set");
        }      
        //Search for element
        System.out.println("Checking if K is present: " + hs.contains("K"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}

/*
 * Create a HashSet named hs. Add 6 objects using add() method to the HashSet.
 * Then print the size of the HashSet using the size() method. Remove an element
 * using the remove() method. Also try to remove an element that is not present
 * in the Set. Use the contains() method to check if an item is in the Set or
 * not. Print the updated set
 */