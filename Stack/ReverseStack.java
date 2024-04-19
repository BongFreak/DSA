package Stack;
import java.util.Stack;
public class ReverseStack {

/*	//when Address change is not optional & there is no limitation of Stack building...
	public static void main(String[] args) {
	
		Stack<Integer>s1 = new Stack<>();
		Stack<Integer>s2 = new Stack<>();
		Stack<Integer>s3 = new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1);
		while(s1.size()>0) {
			s2.push(s1.pop());
		}
		System.out.println(s2);
		while(s2.size()>0) {
			s3.push(s2.pop());
		}
		System.out.println(s3);
		while(s3.size()>0) {
			s1.push(s3.pop());
		}
		
		System.out.println(s1);
			
	}
	*/
/*	//when Address change is optional...
	public static void main(String[] args) {
		Stack<Integer>s1 = new Stack<>();
		Stack<Integer>s2 = new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1);
		while(s1.size()>0) {
			s2.push(s1.pop());
		}
		s1=s2;
		System.out.println(s1);
	}
*/
	//when Address change is not optional & there is a limitation of Stack building...
	public static void reverseStack(Stack<Integer>s1, Stack<Integer>s2) {
		if (s1.size()<=1) {
			return;
		}
		int x=s1.pop();
		reverseStack(s1, s2);
		while(s1.size()>0) {
			s2.push(s1.pop());
		}
		s1.push(x);
		while (s2.size()>0) {
			s1.push(s2.pop());
		}
	}
	public static void main(String[] args) {
		Stack<Integer>s1 = new Stack<>();
		Stack<Integer>s2 = new Stack<>();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		System.out.println(s1);
		reverseStack(s1, s2);
		System.out.println(s1);

	}
}
