package com.glearning.lab3dsa.service;

import java.util.Stack;

public class BalancedBrackets {
	public static boolean isBalanced(String input) {
		//create a stack of characters
		Stack<Character> stack=new Stack<>();
		//iterate through the elements of input
		for(int i=0;i<input.length();i++) {
			//extract the character from input string
			char ch=input.charAt(i);
			//if character is either '(' or '[' or '{' then add to stack
			if(ch=='(' || ch=='[' || ch=='{' ) {
				//push the char to stack
				stack.push(ch);
			}
			else if (ch == ')' || ch == '}' || ch == ']') {
				//start popping elements from stack
				//if popped element does not match the closing brackets, return false
				char top = stack.pop();
				if ((ch == ')' && top != '(') 
					|| (ch == '}' && top != '{')
					|| (ch == ']' && top != '[')) {
					return false;
				}
			}
		}
		return stack.empty();
	}
}




