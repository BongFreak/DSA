package Arraylist;
import java.util.*;
public class Reverse_Arraylist2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(0);
		l1.add(10);
		l1.add(3);
		l1.add(5);
		l1.add(22);
		l1.add(10);
		System.out.println("Original List "+l1);
		Collections.reverse(l1);
		System.out.println("Reverse List "+l1);
	}

}
