package day19;

// A b=(c)d;

public class TypeCastingObjects3 {
	
	public static void main(String[] args) {
		//Ex1
		//Object o=new String("welcome");
		
		//StringBuffer sb=(StringBuffer)o;  //rule1 passed //rule2 passed //rule3 failed
		
		//EX2
		//String s=new String("welcome");
		//StringBuffer sb=(StringBuffer) s; //rule1 failed
		
		//Ex3
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //rule1 passed //rule2 passed //rule3-failed
		
		//Ex4
		
		//Object o=new String("welcome");
		//StringBuffer sb=(String) o; //rule 1 passed //rule 2 failed
		
		//Ex5
		//String s=new String("welcome");
		//StringBuffer sb=(String) s; //rule1 -pass //rule2 failed
		
		//Ex6
		//Object o=new String("welcome");
		//StringBuffer sb=(StringBuffer) o; //rule1 pass rule2 passed rule3 failed
		
		//Ex7
		Object o=new String("welcome");
		String s=(String)o;
		
		System.out.println(s);
		
	}

}
