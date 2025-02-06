import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial=1, n;
		System.out.println("Enter Any Number:");
		n = sc.nextInt();
		for (int i = 2; i <=n; i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial of Given Number:");
		System.out.println(factorial);
	}

}
