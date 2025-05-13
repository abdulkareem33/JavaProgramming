package day10;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		
		Employee emp1=new Employee(); //object
		emp1.eid=101;
		emp1.job="manager";
		emp1.ename="kareem";
		emp1.sal=50000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.ename="john";
		emp2.job="engineer";
		emp2.sal=40000;
		emp2.display();
		
		

	}

}
