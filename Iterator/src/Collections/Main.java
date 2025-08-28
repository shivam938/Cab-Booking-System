package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
     
	 public static void main(String[] args) {
	        ArrayList<String> cities = new ArrayList<>();
	        cities.add("Delhi");
	        cities.add("Mumbai");
	        cities.add("Chennai");
	        cities.add("Kolkata");
	        cities.add("Pune");
	        
	        Iterator<String> it = cities.iterator();
	        while(it.hasNext()) {
	        	String city=it.next();
	        	if(city.startsWith("P")) {
	        		it.remove();
	        	}else {
	        		System.out.println(city);
	        	}
	        }
	
}}
