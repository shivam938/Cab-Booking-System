package Booking;

public class Cab {
    private String cabId;
    private String driverName;
    private String type;
    private boolean available;
    public Cab(String cabId, String driverName, String type) {
        this.cabId = cabId;
        this.driverName = driverName;
        this.type = type.toLowerCase();
        this.available = true;
    }
    public double calculateFare(double distance) {
        if (type.equals("mini")) {
            return distance * 10;
        } else if (type.equals("luxury")) {
            return 100 + (distance * 20);
        } else {
            return 0;
        }
    }
    public String getCabId() {
        return cabId;
    }
    public String getDriverName() {
        return driverName;
    }
    public String getType() {
        return type;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}


