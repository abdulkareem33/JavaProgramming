package day18;

public class CheckedExceptions {

	public static void main(String[] args) 
	{
		System.out.println("program is started...");
		System.out.println("program in progress...");
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		
		System.out.println("program is finished...");
		System.out.println("program is excited...");
		
		
	}

}
