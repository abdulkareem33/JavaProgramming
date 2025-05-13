package day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Progarm is started");
		
		Scanner sc=new Scanner(System.in);
		
		//ex1
		/*System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		System.out.println(100/num); //ArithmeticException
		
		
		
		*/
		
		//ex2
		/*int a[]=new int[5];
		
		System.out.println("Enter the position(0-4):");
		int pos=sc.nextInt();
		
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value; //ArrayIndexOutOfBoundsException
		
		System.out.println(a[pos]);
		*/
		//Ex3
		/*String s="welcome";		//NumberFormatException
		int num=Integer.parseInt(s);
		System.out.println(num);
		
		
		
		*/
		
		//Ex4
		String s=null;			
		System.out.println(s.length());		//NullPointerException
		
		System.out.println("Program is completed");
		System.out.println("program is exited");
	}
	

}
