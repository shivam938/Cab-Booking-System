package main;

public class practice5 {
	public static void main(String args[]) {
		int arr[]= {101,202,303,404};
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int sum=0;
			while(num>0) {
				
				int digit=num%10;
				
				sum+=digit;
				
				num=num/10;
				
			}
			System.out.println("Sum of digits in " + arr[i] + " is: " + sum);
		}
		
	}
	
}
