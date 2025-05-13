package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		//Ex1 1 to 10
		
		/*int i=1; //Initialization
		
		while(i<=10) //condition
		{
			System.out.println(i);
			i++;  //increment
		}
		*/
		
		// Ex2 print hello msg 10 times
		
		/*int i=1;
		
		while(i<=10)
		{
			System.out.println("hello");
			i++;
		}*/
		
		//Ex3 even numbers 1..10
		/*int i=2;
		
		while(i<=10)
		{
			System.out.println(i);
			i+=2;
		}*/
		/*int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}*/
		
		int i=1;
		while(i<=20)
		{
			if(i%2==0)
			{
				System.out.println(i+ "even");
			}
			else
			{
				System.out.println(i+"odd");
			}
			i++;
		}
	}

}
