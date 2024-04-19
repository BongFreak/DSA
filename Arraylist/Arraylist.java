package Arraylist;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<Boolean> list1 = new ArrayList<>();
//		ArrayList<Float> list2 = new ArrayList<>();
		
		//Add new elements in ArrayList
		list.add(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(22);
		
		//get an element at ith Index
		System.out.println(list.get(1));
		// 10
		
		//print with for loop
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
//		0
//		10
//		3
//		5
//		22
		
		//print the array list directly
		System.out.println(list);
//		[0, 10, 3, 5, 22]
		
		//adding element at some index i 
		list.add(1,100);
		System.out.println(list);
//		[0, 100, 10, 3, 5, 22]
		
		//modifying an element at index i
		list.set(1,20);
		System.out.println(list);
//		[0, 20, 10, 3, 5, 22]
		
		//removing an element through index
		list.remove(1);
		System.out.println(list);
//		[0, 10, 3, 5, 22]
		
		//removing an element through value
		list.remove(Integer.valueOf(22));
		System.out.println(list);
//		[0, 10, 3, 5]
		//this method return boolean type.
		//suppose, we print this method then it return value true or false
		//ex:-System.out.println(list.remove(Integer.valueOf(22))); output:- true
		//	  System.out.println(list.remove(Integer.valueOf(30)));	output:- false
		
		//checking if an element exists
		boolean ans = list.contains(Integer.valueOf(5));
		System.out.println(ans);
//		true
		
		//if you don't specify class, you can put anything inside list
		ArrayList l = new ArrayList();
		l.add(1);
		l.add("aksh");
		l.add(true);
		System.out.println(l);
//		[1, aksh, true]
	}

}
