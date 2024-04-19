package Stack;

import java.util.Stack;

public class balance_bracket {
	public static boolean b_Bracket(String s) {
		Stack<Character>stack = new Stack<>();
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c=='(') {
				stack.push(c);
			} else {
				if (!stack.isEmpty() && c==')'&&stack.peek()=='(') {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		

	}

}
