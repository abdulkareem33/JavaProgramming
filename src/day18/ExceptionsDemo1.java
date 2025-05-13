package day18;

import java.util.Scanner;

public class ExceptionsDemo1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("program is started....");
	/*	
		System.out.println("enter a number..");
		int num=sc.nextInt();           //nextInt() method
		System.out.println(100/num);    //Arithmetic exception
	*/
		
		
	/*	int a[]=new int[5];
		
		System.out.println("enter position 0-4..");
		int pos=sc.nextInt(); 
		
		System.out.println("enter a value:");
		int value=sc.nextInt();
		
		a[pos]=value;                     //ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);	            
	*/
		
		
	/*	String s="welcome";
		int num=Integer.parseInt(s);		//NumberFormatException
		System.out.println(num);
	*/
		
		String s=null;
		System.out.println(s.length());     //length() method //NullPointerException
		
		
		
		System.out.println("progarm is completed...");
		System.out.println("program is exited...");
		
		
	}

}
