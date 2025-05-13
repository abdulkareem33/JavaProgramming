package day7;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter fisrt number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("Addition of 2 numbers:"+(num1+num2));
		
		System.out.println("Enter unknown value:");
		Object value=sc.next();
		System.out.println(value);
	}

}
