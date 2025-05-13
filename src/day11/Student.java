package day11;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	void printstudentData()
	
	{
		System.out.println(sid+"   "+sname+"   "+grad);
	}
	
	void setStudentData(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
	
	//constructor
	Student(int id,String name,char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}

}
