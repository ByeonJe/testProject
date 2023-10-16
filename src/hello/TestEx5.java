package hello;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("돈의 액수를 입력하세요>>");
		
		int a = scanner.nextInt();
		
		int fifty = a / 50000;
		System.out.print("오만원" + fifty + "개");
		
		int ten = (a % 50000) / 10000;
		System.out.print("만원" + ten + "개");
		
		int five = (a % 10000) / 5000;
		System.out.print("오천원" + five + "개");
		
		int four = (a % 5000) / 1000;
		System.out.print("천원" + four + "개");
		
		int three = (a % 1000) / 500;
		System.out.print("500백" + three + "개");
		
		int two = (a % 500) / 100;
		System.out.print("100원" + two + "개");
		
		int one = (a % 100) / 10;
		System.out.print("오천원" + one + "개");
		
		int zero = (a % 10) / 1;
		System.out.print("1원" + zero + "개");

		}

}
