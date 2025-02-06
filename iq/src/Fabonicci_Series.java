import java.util.Scanner;

public class Fabonicci_Series {
	public static void main(String[] args) {
		
		int number=123,reverse=0;
		while(number!=0){
			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		System.out.println("Reversed of Number="+reverse);
	}
}
