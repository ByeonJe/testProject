package hello;

import java.util.Scanner;

public class TestEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 층인지 입력하세요>>");
		int height = 5;
		int floor = scanner.nextInt();
		int result = height * floor;
		
		System.out.println((result) + "m");
	}

}
