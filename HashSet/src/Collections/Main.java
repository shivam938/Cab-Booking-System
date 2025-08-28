package Collections;
import java.util.HashSet;
public class Main {
      public static void main(String[] args) {
	        int[] arr = {10, 20, 10, 30, 40, 20, 50};
	        HashSet<Integer> uniqueNumbers = new HashSet<>();
	        for (int num : arr) {
	            uniqueNumbers.add(num);
	        }
	        for (int number : uniqueNumbers) {
	            System.out.println(number);
	        }
	        if (uniqueNumbers.contains(30)) {
	            System.out.println("contains the number 30");
	        } else {
	            System.out.println("set does not contain the number 30");
	        }
	    }
	}