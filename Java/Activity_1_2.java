import java.util.Arrays;

public class Activity_1_2 {
   public static void main(String[] args) {
       int[] array_Number={10, 77, 10, 54, -11, 10};
       System.out.println("Array values are: "+ Arrays.toString(array_Number));
       int find_Number=10;
       int sum=30;
       System.out.println("Result is: "+result(array_Number,find_Number,sum));
   }
   public static boolean result(int[] numbers,int find_Number,int sum) {
       int temp_Sum = 0;
       for (int number:numbers) {
           if (number==find_Number) {
               temp_Sum=temp_Sum+find_Number;
           }
           if (temp_Sum>sum) {
               break;
           }
       }
       return temp_Sum==sum;
   }
}


