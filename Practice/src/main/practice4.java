package main;

public class practice4 {
	    public static void main(String[] args) {
	        int[] arr = {12, 35, 1, 10, 34, 1};
	        if (arr.length < 2) {
	            System.out.println("Array shld have two ele");
	            return;
	        }
	        int max = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        int secondMax = Integer.MIN_VALUE;
	        boolean found = false;
	        for (int num : arr) {
	            if (num != max && num > secondMax) {
	                secondMax = num;
	                found = true;
	            }
	        }
	        if (found) {
	            System.out.println("Second Largest = " + secondMax);
	        } else {
	            System.out.println("There is no distinct second largest element.");
	        }
	    }
	}
