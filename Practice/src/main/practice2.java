package main;
import java.util.Scanner;
public class practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		int org=n;
		int rev=0;
		while(n!=0) {
			int digit=n%10;
			rev =rev*10+digit;
			n=n/10;			
		}
		System.out.println("reverse ="+ rev);
	}

}
