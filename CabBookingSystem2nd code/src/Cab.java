
public class Cab {
	private int cabId;
	private String dname;
	private boolean availability;
	public Cab(int cabId, String dname) {
		this.cabId = cabId;
		this.dname = dname;
		this.availability = true;
	}
	public int getCabId() {
		return cabId;
	}
	public void setCabId(int cabId) {
		this.cabId = cabId;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
}
