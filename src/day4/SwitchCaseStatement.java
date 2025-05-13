package day4;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		
		int weekno=9;
		
		switch(weekno)
		{
		case 1:System.out.println("Sunday");break;
		case 2:System.out.println("mon");break;
		case 3:System.out.println("tues");break;
		case 4:System.out.println("wed");break;
		case 5:System.out.println("thurs");break;
		case 6:System.out.println("fri");break;
		case 7:System.out.println("Saturday");break;
		default:System.out.println("invaild week number");
		}
	}

}
