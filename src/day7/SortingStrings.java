package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		char s[]= {'D','C','B','A'};
		
		System.out.println("Before sorting..."+ Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("After sorting...."+ Arrays.toString(s));
	}

}
