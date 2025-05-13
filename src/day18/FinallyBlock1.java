package day18;

public class FinallyBlock1 {

	public static void main(String[] args) 
	{
		
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		
		catch(NullPointerException e)									
		{
			System.out.println("catch block handled exception....");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("you entered into finally block...");
		}
    		
		
		System.out.println("program is finished....");
		
	}

}
