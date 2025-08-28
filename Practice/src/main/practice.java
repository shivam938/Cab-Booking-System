package main;
import java.util.Scanner;
public class practice {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int n = scanner.nextInt();
	        if (n > 0) {
	            System.out.println("The number is positive.");
	        } else if (n < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }
	        if (n % 2 == 0) {
	            System.out.println("The number is even.");
	        } else {
	            System.out.println("The number is odd.");
	        }
	        if (n % 3 == 0 && n % 5 == 0) {
	            System.out.println("The number is divisible by both 3 and 5.");
	        } else {
	            System.out.println("The number is not divisible by both 3 and 5.");
	        }
	    }
	}
