package day13;

public class StaticMain {
	
public static void main(String[] args) {
		
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		
		//System.out.println(b); //cannot access bcz b & m2 is non static method
		//m2();
		
		StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		sd.m();

}
}
