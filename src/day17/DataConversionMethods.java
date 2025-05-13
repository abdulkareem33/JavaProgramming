package day17;

public class DataConversionMethods {

	public static void main(String[] args) 
	{
		// String---> integer
		
		//String s="welcome";		//cannot convert to int
		
		//Integer wrapper
		
		/*String s1="10";
		String s2="20";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));	//parseInt() method 
		
		*/
		
		//String---->double
		
		/*String s1="10.5";
		String s2="20.0";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));		//parseDouble
		
		*/
		
		//String ---->boolean
		
		/*String s="true";		//other then true, anything will return false  //parseBoolean
		System.out.println(Boolean.parseBoolean(s));
		
		*/
		
		//int,double,boolean,char---->String		***valueOf() method - all primitive into string
		
		int a=10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));			//Below syntax is about collections
		System.out.println(String.valueOf(bool));		//ArrayList<Integer> arr=new ArrayList<Integer>();
		
		
		
		
		
		
		
	}

}
