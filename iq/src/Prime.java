import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag=0, n;
		System.out.println("Enter Any Number:");
		n = sc.nextInt();
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0)
				flag = 1;
			break;
		}
		if (flag==0)
			System.out.println("Number is  Prime!");
		else
			System.out.println("Number is Not Prime!");
	}
}
