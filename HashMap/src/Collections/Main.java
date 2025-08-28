package Collections;
import java.util.HashMap;
import java.util.Map;
public class Main {
public static void main(String[] args) {
	HashMap<Integer,String>student=new HashMap<>();
	student.put(101, "Alice");
    student.put(102, "Bob");
    student.put(103, "Charlie");
    for (Integer key : student.keySet()) {
        System.out.println(key);
    }
    for (String value : student.values()) {
        System.out.println(value);
    }
    String name=student.get(102);
    System.out.println(name);
    student.remove(101);
    
    for (Map.Entry<Integer, String> entry : student.entrySet()) {
        System.out.println(entry.getKey()+" is " +entry.getValue());
    }
}
}
