package day19;

class Parent
{
	String name="kareem";
	void m1()
	{
		System.out.println("this is m1 from parent..");
	}
}
class Child extends Parent
{
	int id=101;
	void m2()
	{
		System.out.println("this is m2 from child..");
	}
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
		/*Child c=new Child();
		System.out.println(c.name);
		c.m1();
		System.out.println(c.id);
		c.m2();
		*/
		
		/*Parent p=new Child(); 
		System.out.println(p.name);
		p.m1();
		System.out.println(p.id); //we cannot access
		p.m2();  //we cannot access
		*/
		
		
		
		
	}

}
