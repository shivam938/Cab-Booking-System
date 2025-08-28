import java.util.*;
public class Main {
	static List<Cab> cabs = new ArrayList<>();
	static List<Customer> customers = new ArrayList<>();
	static Map<Customer, Cab> booking = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch = 1;
		int choice;
		Scanner sc = new Scanner(System.in);
		
		while( ch == 1) {
			System.out.println("Menu: ");
			System.out.println("1. Add cab");
			System.out.println("2. Add customer");
			System.out.println("3. Book cab ");
			System.out.println("4. Calc my fare");
			System.out.println("5. Display Bookings");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					addCab(sc);
					break;
				case 2:
					addCustomer(sc);
					break;
				case 3:
					bookCab(sc);
					break;
				case 4:
					calcMyFare(sc);
					break;
				case 5:
					displayBookings();
					break;
				case 6:
					ch = 0;
					break;
			}
		}
		

	}
	static void addCab(Scanner sc) {
		System.out.println("Enter cab Id");
		int cabId = sc.nextInt();
		System.out.println("Enter Driver name");
		String dname = sc.next();
		Cab c = new Cab(cabId, dname);
		cabs.add(c);
	}
	static void addCustomer(Scanner sc) {
		System.out.println("Enter customer Id");
		int cid = sc.nextInt();
		System.out.println("Enter customer name");
		String name = sc.next();
		Customer c1 = new Customer(cid, name);
		customers.add(c1);
		
	}
	static void bookCab(Scanner sc) {
		System.out.println("Enter customer Id");
		int cid = sc.nextInt();
		int flag = 0;
		int flag2 = 0;
		Customer customer = null;
		Cab cab = null;
		try {
			for(Customer c : customers) {
				if(c.getId() == cid) flag = 1;
			}
			if(flag == 0) throw new InvalidCustomerException("Cusotmer id is not in registered customers");
			for(Cab c : cabs) {
				if(c.isAvailability() == true) flag2 = 1;
			}
			if(flag2 == 0) throw  new CarNotAvailable("No cab is available at the moment");
			for(Customer c : customers) {
				if(c.getId() == cid) customer = c;
			}
			for(Cab c : cabs) {
				if(c.isAvailability() == true) {
					c.setAvailability(false);
					cab = c;
					break;
				}
			}
			booking.put(customer, cab);
			
		}
		catch(InvalidCustomerException e) {
			System.out.println(e.getMessage());
		}
		catch(CarNotAvailable e) {
			System.out.println(e.getMessage());
		}
	}
	static void calcMyFare(Scanner sc) {
		System.out.println("Enter customer Id");
		int cid = sc.nextInt();
		int flag = 0;
		int type;
		int distance;
		Customer customer = null;
		try {
			for(Customer c : customers) {
				if(c.getId() == cid) {
					flag = 1;
					customer = c;
				}
			}
			if(flag == 0) throw new InvalidCustomerException("Cusotmer id is not in registered customers");
			if(! booking.containsKey(customer)) throw new NoBookingException("This customer has not yet booked a cab");
			System.out.println("You have successfully booked a cab already before calculating the fare enter the distance: ");
			distance = sc.nextInt();
			System.out.println(" chose the type of cab: ");
			System.out.println("1. Minicab");
			System.out.println("2. Luxury");
			type = sc.nextInt();
			switch(type) {
				case 1:
					int fare = distance*10;
					System.out.println("Your entire fare will be: "+fare);
					break;
				case 2:
					fare = 100+(distance*20);
					System.out.println("Your entire fare will be: "+fare);
					break;
			}
			
		}
		catch(InvalidCustomerException e) {
			System.out.println(e.getMessage());
		}
		catch(NoBookingException e) {
			System.out.println(e.getMessage());
		}
	}
	static void displayBookings() {
		for (Map.Entry<Customer, Cab> entry : booking.entrySet()) {
		    Customer customer = entry.getKey();
		    Cab cab = entry.getValue();
		    
		    System.out.println("Customer ID: " + customer.getId() + 
		                       " booked Cab ID: " + cab.getCabId() + 
		                       " driven by " + cab.getDname());
		}
	}

}
