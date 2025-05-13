package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		//declaring
		
		//Apporach1
		
		/*int a[]= new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[5]=500;*/
		
		//Approach2
		int a[]= {100,200,300,400,500};
		
		//find length of an array
		
		//System.out.println(a.length);
		
		//read single value 
		//System.out.println(a[4]);
		
		//reading all the values from array
		
		//normal for loop
		
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//enhanced for loop 
		
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
