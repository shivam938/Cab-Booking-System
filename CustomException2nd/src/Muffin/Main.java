package Muffin;

	class InvalidQuantityException extends Exception {
	    public InvalidQuantityException(String message) {
	        super(message);
	    }
	}
	class InvalidPaymentException extends Exception {
	    public InvalidPaymentException(String message) {
	        super(message);
	    }
	}
	class Order{
		String productName;
		int pricePerUnit;
		int availableStock;
		
		 public Order(String productName, int pricePerUnit, int availableStock) {
		        this.productName = productName;
		        this.pricePerUnit = pricePerUnit;
		        this.availableStock = availableStock;}
		
		public void placeOrder(int quantity,double paymentAmount)throws InvalidQuantityException ,InvalidPaymentException{
			
			if(quantity<=0 || quantity>availableStock) {
				throw new InvalidQuantityException("invalid quantity"+availableStock);
			}
			int totalCost=quantity*pricePerUnit;
			
			if(paymentAmount<totalCost) {
				throw new InvalidPaymentException("invalid payment"+totalCost +"amountrequire" +paymentAmount);
			}
			availableStock-=quantity;
			 System.out.println("Order placed successfully");
			
		}
	}
	public class Main {
	    public static void main(String[] args) {
	        Order order = new Order("computer", 50000, 6); 

	        try {
	            order.placeOrder(0, 120000);
	            order.placeOrder(0, 100000); 
	            order.placeOrder(3, 100000); 
	        } catch (InvalidQuantityException | InvalidPaymentException e) {
	            System.out.println("Exception" + e.getMessage());
	        }
	    }
	}
