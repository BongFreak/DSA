package Stack;

import java.util.Stack;
class person{
	String name;
	int age;
	double dis;
	public person(String name,int age,double dis) {
		this.name = name;
		this.age = age;
		this.dis = dis;

	}
}
public class Fundamental {
	private static void printStack(Stack<Integer>s1) {
		while(s1.size()>0) {
			System.out.println(s1.pop());
		}
		
	}
	public static void main(String[] args) {
	//		Stack<Integer>s1 = new Stack<>();
	//		s1.push(1);
	//		s1.push(2);
	//		s1.push(3);
	//		s1.push(4);
	//		s1.push(5);
	//		printStack(s1);
	//		System.out.println(s1.isEmpty());
		Stack<person> s = new Stack<>();
		person p1 = new person("Ravi", 56, 78.09);
		s.push(p1);
		person p2 = new person("Raju", 58, 25.09);
		s.push(p2);
		person p3 = new person("Rahim", 53, 50.09);
		s.push(p3);
		person p4 = new person("Rahul", 60, 60.09);
		s.push(p4);
	}

}
