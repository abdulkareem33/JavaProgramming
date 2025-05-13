package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Declaring array
		
		//Approach1
		
		/*int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/
		
		//Approach2
		
		int a[][]= {{100,200},
					{300,400},
					{500,600}};
		
		//size 
		
		System.out.println("lenghth of rows"+a.length);
		System.out.println("lenghth of columns"+a[0].length);
		
		//System.out.println(a[2][1]);
		
		//normal for loop
		
		/*for(int r=0;r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.print(a[r][c]+"   ");
			}
			System.out.println();
		}*/
		
		//enhanced for loop
		
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
