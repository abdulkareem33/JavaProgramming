package day19;

//upcasting-converting value from smaller to larger // int - long //float - double

//Down casting- converting value from larger to smaller //long - int //double - float



public class TypeCastingConcept {

	public static void main(String[] args) {
		
		//upcasting automatic smaller to larger
		
		/*int intvalue=100;
		long longvalue=intvalue;
		
		System.out.println(longvalue);
		*/
		
		//float floatvalue=10.5f;
		//double doublevalue=floatvalue; //upcasting
		
		//downcasting - manually - larger to smaller
		
		//long longvalue=10000;
		//int intvalue=(int)longvalue;
		
		//double doublevalue=125.55;
		//float floatvalue=(float)doublevalue;
		
		//ex1
		
		/*int i=100;
		double d=i;
		System.out.println(d);
		*/
		
		//ex2
		
		double d=10.5;
		int i=(int)d;
		System.out.println(i);
		
		
	}

}
