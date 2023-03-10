/**
* @Developer : Sagar_Pokale
* 28-Oct-2022 10:21:33 PM
**/

package _05_Postfix;

import java.util.Stack;

public class PostFix_Evaluation {

	public static void main(String[] args) {
		int result;
		String postfix = "59+4862/-*-173-";
//		59+4862/-*-173-$+
		result = solvePostfix(postfix);
		System.out.println("Postfix Result: " + result);
//		String prefix = "+-+59*4-8/62$1-73";
//		result = solvePrefix(prefix);
//		System.out.println("Prefix Result: " + result);

	}

	public static int solvePostfix(String postfix) {
		int result = 0;
		// 0. Create stack of operands
		Stack<Integer> s = new Stack<Integer>();
		// 1. Traverse postfix expr from left to right
		for (int i = 0; i < postfix.length(); i++) {
			char sym = postfix.charAt(i);
			// 2. If operand, push on the stack
			if (Character.isDigit(sym)) {
				s.push((int) sym - 48);
			}
			// 3. If operator, pop two operands from stack, calculate result and push on
			// stack
			else {
				int b = s.pop();
				int a = s.pop();
				result = calc(a, b, sym);
				s.push(result);
			}
			// 4. Repeat until postfix expr is completed
		} // 5. Pop final result from stack and return
		result = s.pop();
		return result;
	}

	public static int solvePrefix(String prefix) {
		int result = 0;
		Stack<Integer> s = new Stack<Integer>();
		for (int i = prefix.length() - 1; i >= 0; i--) {
			char sym = prefix.charAt(i);
			if (Character.isDigit(sym)) {
				s.push((int) sym - 48);
			} else {
				int a = s.pop();
				int b = s.pop();
				result = calc(a, b, sym);
				s.push(result);
			}
		}
		result = s.pop();
		return result;
	}

	public static int calc(int a, int b, char sym) {
		switch (sym) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		case '$':
			return (int) Math.pow(a, b);
		}
		return 0;
	}

}
