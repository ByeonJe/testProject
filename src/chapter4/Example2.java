package chapter4;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		char operator = '-';

//		if (operator == '+') {
//			i = num1 + num2;
//		} else if (operator == '-') {
//			i = num1 - num2;
//		} else if (operator == '*') {
//			i = num1 * num2;
//		} else if (operator == '/') {
//			i = num1 / num2;
//		} else {
//			System.out.println("오류");
//		}
//		System.out.println(i);

		for (int dan = 0; dan < 4; dan++) {
			
			for(int j = 0; j < 3 - dan; j++) {
				System.out.print(j);
			}
			
			for (int k = 0; k < 2 * dan + 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int san = 3; san > 0; san--) {
				
				for(int j = 6; j >= 3 + san; j--) {
					System.out.print(j);
				}
				
				for (int k = 0; k < 2 * san - 1; k++) {
					System.out.print("*");
				}
			System.out.println("");
		}
	}

}
