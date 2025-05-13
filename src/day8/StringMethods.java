package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		//String s="welcome";
		//String s=new String("welcome");
		
		//System.out.println(s);
		
		//length()-returns length of a string
		
		String s="welcome";
		int l=s.length();
		System.out.println(l);
		System.out.println("Kareem".length());
		
		//Concat() - Joining strings 
		String s1="welcome";
		String s2="  to java";
		String s3="automation";
		
		System.out.println(s1+s2);  //welcome to java
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3)); //welcome to java automation
		
		System.out.println("welcome"+"to java");
		System.out.println("welcome".concat("to java"));
		
		//trim() - remove spaces left and right sides
		
		s="   welcome   ";
		System.out.println(s);
		System.out.println("Before trim"+s.length());
		System.out.println(s.trim());
		System.out.println("After trim"+s.trim().length());
		
		//charAt()-returns a character from a string based on index
		//index starts from 0
		s="welcome";
		System.out.println(s.charAt(3)); //c
		System.out.println(s.charAt(0)); //w
		
		//contains() -returns true or false
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("Wel"));  //false case sensitive
		
		
		//equals (), equalsIgnoreCase() - compare strings
		
		s1="welcome";
		s2="welcome";
		s3="Welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//replace()- replace single/multiple(sequence) of characters in a string
		s="welcome to selenium java selenium python selenium c# ";
		System.out.println(s.replace('e', 'x'));
		System.out.println(s.replace("selenium","playwright"));
		
		//substring - extract sub string from main string
		//starting index-0
		//ending index-1
		s="selenium";
		System.out.println(s.substring(0,5));
		
		//toUpperCsae() toLowerCase()
		
		s="welcome";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split()-split the string into multiple parts based on delimeter
		s="abc@gmail.com";
		
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//ex1
		String amount="$15,20,55";   //exp 152055
		
		System.out.println(amount.replace("$",""));
		System.out.println(amount.replace(",","").replace("$",""));
		
		//ex2
		
		s="abc,123@xyz";
		
		String arr1[]=s.split(","); //abc  123@xyz
		System.out.println(Arrays.toString(arr1));
		
		String arr2[]=arr1[1].split("@");  
		System.out.println(Arrays.toString(arr2)); //[123, xyz]
		
		System.out.println(arr1[0]);
		
		System.out.println(arr2[0]);
		
		System.out.println(arr2[1]);
		
	
	}
}
