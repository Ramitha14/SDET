import java.util.ArrayList;
public class Activity_3_1 {
	public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Ram");
        myList.add("Sam");
        myList.add("Jim");
        myList.add(3, "Shri");
        myList.add(1, "Vikas");
        System.out.println("Print All the Objects:");
        for(String s:myList)
        {
            System.out.println(s);
        }
        System.out.println("Third element is: " + myList.get(2));
        System.out.println("Is Allis present in list: " + myList.contains("Allis"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Shri");
        System.out.println("New Size of ArrayList: " + myList.size());
        System.out.println("Is shri present in new Arraylist: " + myList.contains("Shri"));
    }
}	


/*
 * Create an ArrayList named myList of type String. Add 5 names to the ArrayList
 * using add() method. Then print all the names using for loop. Then use get()
 * method to retrieve the 3rd name in the ArrayList. Use contains() method to
 * check if a name exists in the ArrayList. Use size() method to print the
 * number of names in the ArrayList. Use remove() method to remove a name from
 * the list and print the size() of the list again.
 */