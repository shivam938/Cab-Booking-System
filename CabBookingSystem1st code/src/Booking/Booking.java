package Booking;

public class Booking {
    private Customer customer;
    private Cab cab;
    private double distance;
    private double fare;
    public Booking(Customer customer, Cab cab, double distance) {
        this.customer = customer;
        this.cab = cab;
        this.distance = distance;
        this.fare = cab.calculateFare(distance);
    }
    public Customer getCustomer() {
        return customer;
    }
    public Cab getCab() {
        return cab;
    }
    public double getDistance() {
        return distance;
    }
    public double getFare() {
        return fare;
    }
}
