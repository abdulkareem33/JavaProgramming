package day18;

import java.util.Scanner;

public class HandleException {

	
			public static void main(String[] args) {
				
				System.out.println("Progarm is started");
				
				Scanner sc=new Scanner(System.in);
				
				
				System.out.println("Enter a number");
				
				int num=sc.nextInt();
				
				try
				{
				System.out.println(100/num);			 //ArithmeticException
				}
				catch(ArithmeticException e)
				{
					System.out.println("Invalid data");
				}
				System.out.println("Program is completed");
				System.out.println("program is exited");
	}

}
