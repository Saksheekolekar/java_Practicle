package pattern;

import java.util.Scanner;

public class One {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);             //     enter Limit
	System.out.println("enter Limit");             //     5
	int n=sc.nextInt();                            //     1
	for (int i = 1; i<=n; i++) {                   //     12
		for (int j = 1; j <=i; j++) {              //     123
			System.out.print(j);                   //     1234
		}                                          //     12345
		System.out.println();                           
	}
}
}
