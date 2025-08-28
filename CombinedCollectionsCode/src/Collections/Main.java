package Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Main {

	

	public class CategoryMap {
	    public static void main(String[] args) {
	        HashMap<String, ArrayList<String>> Map = new HashMap<>();
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Mango");

	        ArrayList<String> vegetables = new ArrayList<>();
	        vegetables.add("Carrot");
	        vegetables.add("Potato");
	        vegetables.add("Tomato");

	        Map.put("Fruits", fruits);
	        Map.put("Vegetables", vegetables);

	        Map.get("Fruits").add("Orange");
	        Map.get("Vegetables").add("Onion");

	        System.out.println("Categories and Items:");
	        for (Map.Entry<String, ArrayList<String>> entry : Map.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        ArrayList<String> fruitList = Map.get("Fruits");
	        Iterator<String> iterator = fruitList.iterator();
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            if (fruit.equals("Banana")) {
	                iterator.remove();
	            }
	        }
	        System.out.println(Map.get("Fruits")); //after removing banana
	    }
	}

}
