package hello;

import java.util.Scanner;

public class TestEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값을 입력하세요>>");
		
		int x = scanner.nextInt();
		int y = ((int)Math.pow(x, 2)) - 3 * x + 7;
		System.out.println("x=" + x + ", y=" + y);
	

	}

}
