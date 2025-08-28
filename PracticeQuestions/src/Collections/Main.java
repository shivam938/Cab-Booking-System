package Collections;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> office = new ArrayList<String>();
    office.add("EMP 1");
    office.add("EMP 2");
    office.add("EMP 3");
    office.add("EMP 4");
    office.add("EMP 5");
    
    office.add(0,"xyz");
    
    office.remove(3);
    for(String emp : office) {
    	System.out.println(emp);
    }
  }
}  //ArrayList operation  