package pattern;

public class pyramid {
public static void main(String[] args) {

	for (int i = 1; i <=4; i++) {
	
		for (int j = i; j<=3; j++) {             //   1
			System.out.print("");                //  212
		}                                        // 32123
		for (int j = i; j >=1; j--) {            //4321234
			System.out.print(j);
		}
		for (int j = 2; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
}
}
