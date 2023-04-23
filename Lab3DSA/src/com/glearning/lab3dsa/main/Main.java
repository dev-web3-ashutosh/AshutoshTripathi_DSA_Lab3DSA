package com.glearning.lab3dsa.main;

import java.util.Scanner;

import com.glearning.lab3dsa.model.UserInput;
import com.glearning.lab3dsa.service.BalancedBrackets;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		UserInput obj=new UserInput();
		while(flag) {
			System.out.println("Enter the input  or q to quit::");
			String input = sc.next();
			if (input.equals("q")) {
				flag = false;
				continue;
			}
			obj.setUserInput(input);
			boolean result = BalancedBrackets.isBalanced(obj.getUserInput());
			System.out.println("Input is balanced ? "+ result);
		}
		sc.close();
	}
}
