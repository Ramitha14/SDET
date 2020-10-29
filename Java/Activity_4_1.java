import java.util.*;
public class Activity_4_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();      
        System.out.print("Enter integers");
        System.out.println("(EOF or non-integer to terminate): ");
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        Integer nums[] = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in array at generated index: " + nums[index]);
        scan.close();
    }
}


/*
 * In this activity, accept number inputs from the console using Scanner class
 * and store them in an array. Then use the Random class to generate an index
 * value and print the value in the array at then generated index value. To
 * start create a class RandomScannerActivity with a main() method with the
 * following objects: Create a Scanner object named scan. Create an ArrayList
 * object named list. Create a Random class object named indexGen
 */