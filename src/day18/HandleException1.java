package day18;

import java.util.Scanner;

public class HandleException1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("program is started....");
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try
		{
		System.out.println(100/num);    
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data..");
		}
		
		System.out.println("progarm is completed...");
		System.out.println("program is exited...");
	}

}
