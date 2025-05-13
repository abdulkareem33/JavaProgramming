package day9;

public class ReverseAString {

	public static void main(String[] args)
	{
		//Approach1 - length() , charAT()
		
		/*String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse string is:"+rev);*/
		
		//Approach2 - without using string methods
		
		/*String s="welcome";
		
		String rev="";
		char a[]=s.toCharArray();  //toCharArray is method
		
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("Reverse string is:"+rev);*/
		
		
		//Approach3 - using StringBuffer Class
		
		/*StringBuffer s=new StringBuffer("welcome");
		
		 System.out.println("Reverse string is:"+s.reverse());*/
		
		 
		 //Approach4 - using StringBuilder Class
		 
		 StringBuilder s=new StringBuilder("welcome");
			
		 System.out.println("Reverse string is:"+s.reverse());
		 
		 
		 
		
		
	}

}
