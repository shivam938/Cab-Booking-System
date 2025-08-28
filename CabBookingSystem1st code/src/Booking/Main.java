package Booking;
import java.util.*;

public class Main {

    private static Map<String, Customer> customers = new HashMap<>();
    private static List<Cab> cabs = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("select your option");
            System.out.println("1.add Customer");
            System.out.println("2.add Cab");
            System.out.println("3.book a Cab");
            System.out.println("4.view All Bookings");
            System.out.println("5.Exit");
            System.out.print("Enter your choice");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    addCab(scanner);
                    break;
                case 3:
                    bookCab(scanner);
                    break;
                case 4:
                    viewBookings();
                    break;
                case 5:
                    running = false;
                    System.out.println("thank you for using the Cab Booking System");
                    break;
                default:
                    System.out.println("Invalid option please try again.");
            }
        }
        scanner.close();
    }
    private static void addCustomer(Scanner scanner) {
        System.out.print("Enter customer ID");
        String id = scanner.nextLine();
        System.out.print("Enter customer name");
        String name = scanner.nextLine();
        customers.put(id, new Customer(id, name));
        System.out.println("Customer added successfully");
    }
    private static void addCab(Scanner scanner) {
        System.out.print("Enter cab ID: ");
        String cabId = scanner.nextLine();
        System.out.print("Enter driver name: ");
        String driverName = scanner.nextLine();
        System.out.print("Enter type (mini or luxury): ");
        String type = scanner.nextLine();
        cabs.add(new Cab(cabId, driverName, type));
        System.out.println("Cab added successfully!");
    }

    private static void bookCab(Scanner scanner) {
        System.out.print("enter customer ID");
        String customerId = scanner.nextLine();
        Customer customer = customers.get(customerId);
        if (customer == null) {
            try {
                throw new InvalidCustomerException("invalid customer ID" + customerId);
            } catch (InvalidCustomerException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        Cab availableCab = null;
        for (Cab cab : cabs) {
            if (cab.isAvailable()) {
                availableCab = cab;
                break;
            }
        }

        if (availableCab == null) {
            try {
                throw new CabNotAvailableException("No cabs available");
            } catch (CabNotAvailableException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        System.out.print("Enter the distance");
        double distance = scanner.nextDouble();
        scanner.nextLine();
        Booking booking = new Booking(customer, availableCab, distance);
        availableCab.setAvailable(false);
        bookings.add(booking);
        System.out.println("cab booked successfully!");
        System.out.println("booking Details");
        System.out.println("customer"+ customer.getName());
        System.out.println("cab" + availableCab.getCabId() + " (Driver" + availableCab.getDriverName() + ")");
        System.out.println("distance" + distance + " km");
        System.out.println("fare" + booking.getFare());
    }
    private static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings made yet");
            return;
        }
        
        System.out.println("Booking data");
        for (Booking booking : bookings) {
            System.out.println("Customer" + booking.getCustomer().getName());
            System.out.println("Cab ID" + booking.getCab().getCabId() + " (Driver" + booking.getCab().getDriverName()+")");
            System.out.println("Distance" + booking.getDistance() + "km");
            System.out.println("Fare" + booking.getFare());
        }
    }
}
