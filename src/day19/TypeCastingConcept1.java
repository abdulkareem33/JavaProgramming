package day19;

//upcasting - converting value from smaller ---->larger  int--->long, float--->double

//Downcasting - converting value from larger ----> smaller  long--->int, double--->float

public class TypeCastingConcept1 {

	public static void main(String[] args) 
	{
		
		//upcasting  automatic--->smaller to larger
		
	/*	int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.5f;
		double doublevalue=floatvalue;
	*/
		
		
		//downcasting manual--->larger to smaller
		
		//long longvalue=10000;
		//int intvalue=(int)longvalue;
		
		//double doublevalue=125.55;
		//float floatvalue=(float)doublevalue;
		
	/*	int i=100;
		double d=i;
		System.out.println(d);
	*/
		
		double d=10.5;
		int i=(int)d;
		System.out.println(i);
		
		
		
	}

}
