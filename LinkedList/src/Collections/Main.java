package Collections;
import java.util.LinkedList;
public class Main {
	public static void main(String [] args) {
		LinkedList<Integer>num=new LinkedList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		
		num.addFirst(8);
		num.addLast(90);
		
		num.remove(2);
		for(int numbers : num) {
			System.out.println(numbers);
		}
		
		
	}

}
