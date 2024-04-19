package Recursion;
import java.util.*;
public class Multipication_Table_Series {
	public static void mul(int a, int b) {
		//base case
		if(b==0) return;
		
		//small case
		mul(a,b-1);
		
		//self work
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the Number.....");
		int x = sc.nextInt();
		System.out.println("Input the Number.....");
		int y = sc.nextInt();
		mul(x,y);
	}

}
