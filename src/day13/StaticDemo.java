package day13;

public class StaticDemo {
	
	static int a=10; //static variable
	int b=20;  //non static
	
	static void m1()
	{
		System.out.println("this is m1 satic method...");
	}
	void m2()
	{
		System.out.println("this is m2 non satic method ");
	}
	void m() //non-static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	/*public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		//System.out.println(b); //cannot access bcz b & m2 is non static method
		//m2();
		
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		sd.m();
		
		
	}*/

}
