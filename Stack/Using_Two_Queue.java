package Stack;
import java.util.*;
class Stack{
	public Queue<Integer> q1;
	public Queue<Integer> q2;
	public Stack() {
		this.q1 = new LinkedList<>();
		this.q2 = new LinkedList<>();
	}
	public  int getSize () {
		return q1.size();
	}
	public boolean isEmpty() {
		return q1.size()==0;
	}
	public void push(int element) {
		this.q1.add(element);
	}
	public int pop() {
		if (this.q1.isEmpty()) {
			return -1;
		}
		while (this.q1.size()>1) {
			this.q2.add(this.q1.remove());
		}
		int ans = this.q1.remove();
		while (this.q2.size()>0) {
			this.q1.add(this.q2.remove());
		}
		return ans;
	}
	public int top() {
		if (this.q1.isEmpty()) {
			return -1;
		}
		while (this.q1.size()!=1) {
			this.q2.add(this.q1.remove());
		}
		int ans = this.q1.peek();
		q2.add(q1.remove());
		Queue<Integer>q = q1;
		q1=q2;
		q2=q;
		
		return ans;
	
	}
}
public class Using_Two_Queue {
	
	

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		System.out.println(s.getSize());
		System.out.println(s.top());
		System.out.println(s.top());
		System.out.println(s.pop());
		System.out.println(s.getSize());
		System.out.println(s.top());
		System.out.println(s.getSize());
		
	}

}
