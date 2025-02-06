package iq;

import java.util.*;

public class Duplicate {

	public static <E> void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String To find Duplicate Characters");
		String input = sc.next();

		char string_Array[] = input.toCharArray();
		Set<Character> dublicate=null;
		System.out.println(string_Array);
		System.out.println("Duplicate Elements Are :");

		for (int i = 0; i < string_Array.length; i++) {

			if(string_Array[i] !='0')
			{
				int count = 1;
	            
				for (int j = i + 1; j <string_Array.length; j++) {
					
					if (string_Array[i] == string_Array[j] && string_Array[i]!= '0') {
						count++;
						string_Array[j] ='0';
						
					}
				}
				
				if (count > 1 && string_Array[i] != 0) {
					System.out.println(string_Array[i]);
					dublicate.add(string_Array[i]);
					
				}
				string_Array[i] ='0';
			}
		}
		
	}
}
