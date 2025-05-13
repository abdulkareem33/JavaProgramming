package day11;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu=new Student();
		
		//1)using object reference variables
		
		/*stu.sid=101;
		stu.sname="kareem";
		stu.grad='A';
		*/
		
		//2)using method storing variables
		//stu.setStudentData(101,"John", 'A');
		//stu.printstudentData();
		
		//3)using Constructor
		
		Student stu=new Student(101,"Ramu",'B');
		stu.printstudentData();
	}

}
