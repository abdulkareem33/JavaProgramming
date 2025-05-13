package day16;

interface Shape
{
	int length=10;						//final and static variables
	int width=20;
	
	void circle();						//abstract method
	
	default void square()				//default method
	{
		System.out.println("this is square");
	}
	
	static void rectangle()				//static method
	{
		System.out.println("this is rectangle..");
	}
	
	
}

public class InterfaceDemo implements Shape
{
	
	public void circle()
	{
		System.out.println("this is circle - abstract method..");
	}
	
	public static void main(String[] args) 
	{
		//Scenario 1
		
		InterfaceDemo idobj=new InterfaceDemo();
		
		idobj.circle();
		idobj.square();
		
		Shape.rectangle();		//static method can directly access by using interface name..
		
		//Scenario 2
		
		Shape sh=new InterfaceDemo();		//interface variable and object of class
		
		sh.circle();
		sh.square();
		Shape.rectangle();   
	}

}
