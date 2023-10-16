package hello;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요>>");
		int player = scanner.nextInt();
		int computer = scanner.nextInt();
		int result = player + computer;
		System.out.print(player + " + " + computer + "은 " + result);
	}

}
