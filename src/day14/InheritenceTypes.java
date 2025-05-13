package day14;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}

public class InheritenceTypes {

	public static void main(String[] args) {
		
		C cobj=new C();
		
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		
		/*System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);*/
		
		cobj.display();
		cobj.show();
		cobj.print();
	}

}
