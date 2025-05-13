package day18;

public class MultipleCatchBlocks1 {

	public static void main(String[] args) {
		
		System.out.println("program is started...");
		
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		
	/*	catch(ArithmeticException e)
		{
			System.out.println("Handled exception..");
			System.out.println(e.getMessage());       	//getMessage() method
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled exception..");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handled exception..");
			System.out.println(e.getMessage());
		}
	*/	
		catch(Exception e)									//Exception is parent of all exceptions
		{
			System.out.println("Handled exception..");
			System.out.println(e.getMessage());
		}
    		
		
		System.out.println("program is finished....");
	}

}
