package Exception;

public class ExceptionExample {
	
	    public static void main(String[] args) {
	        try {
	            
	            int result = 10 / 0;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("exception" + e.getMessage());  // This will throw ArithmeticException
	        } finally {
	            System.out.println("This block will execute");
	        }  //this part of code will execute even if the output crashes

	    }
	}

