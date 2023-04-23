package com.glearning.lab3dsa.service;

import java.util.Stack;

import com.glearning.lab3dsa.model.UserInput;

public class BalancedBrackets {
	public void isBalanced() {
		//create a stack of characters
		Stack<Character> stack=new Stack<>();
		UserInput obj=new UserInput();
		String input=obj.getUserInput();
		//iterate through the elements of input
		for(int i=0;i<input.length();i++) {
			//extract the character from input string
			char ch=input.charAt(i);
			//if character is either '(' or '[' or '{' then add to stack
			if(ch=='(' || ch=='[' || ch=='{' ) {
				//push the char to stack
				stack.push(ch);
			}
			//start popping elements from stack
			//if popped element does not match the closing brackets, return false
			
			
		}
	}
}




