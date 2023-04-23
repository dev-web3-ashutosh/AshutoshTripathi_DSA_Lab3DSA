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
			if(result==true) {
				System.out.println("The entered String has Balanced Brackets");
			}
			else if(result==false) {
				System.out.println("The entered Strings do not contain Balanced Brackets");
			}
		}
		if(flag==false) {
			System.out.println("Program terminated successfully");
		}
		sc.close();
	}
}
