package com.greatlearning.balancedbracket;

import java.util.Stack;

public class BlancedBrackets {
	public static boolean checkforbalancedbrackets(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i), val;
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else if (ch == ']' && !stack.isEmpty()) {
				val = stack.pop();
				if (val == '{' || val == '(')
					return false;
			} else if (ch == '}' && !stack.isEmpty()) {
				val = stack.pop();
				if (val == '[' || val == '(')
					return false;
			} else if (ch == ')' && !stack.isEmpty()) {
				val = stack.pop();
				if (val == '{' || val == '[')
					return false;
			}

		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String string = "({}{}([{}}]))";
		System.out.println(checkforbalancedbrackets(string));
	}
}
