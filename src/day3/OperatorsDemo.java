package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		
		//1) Arithmetic operators + - * / %
		
		int a=20, b=10;
		
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Mul of a and b is:"+(a*b));
		System.out.println("Div of a and b is:"+(a/b));
		System.out.println("Modulo div of a and b is:"+(a%b));
		
		//2)Relational or comparison operators - returns true or false > >= < <= != ==
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //t
		System.out.println(a<=b); //f
		b=20;
		System.out.println(a<=b); //t
		System.out.println(a>=b); //t
		
		System.out.println(a!=b); //f
		System.out.println(a==b); //t
		
		boolean res=a>b;
		System.out.println(res);
		
		//3)Logical Operators && || !
		
		boolean x=true;
		boolean y=false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1);
		boolean b2=20>10;
		System.out.println(b2);
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		
		System.out.println((10<20) && (20>10));
		
		
		
		
		
		
		
		
		
		
		
	}

}
