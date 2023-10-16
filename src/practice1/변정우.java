package practice1;

import java.util.Scanner;

public class 변정우 {

	public static void main(String[] args) {
		//Q1
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요>>");
		int player = scanner.nextInt();
		int computer = scanner.nextInt();
		int result = player + computer;
		System.out.println(player + " + " + computer + "은 " + result);
		
		//Q2
		System.out.print("몇 층인지 입력하세요>>");
		int height = 5;
		int floor = scanner.nextInt();
		int result1 = height * floor;
		
		System.out.println((result1) + "m");
		
		//Q3
		System.out.print("x 값을 입력하세요>>");
		
		int x = scanner.nextInt();
		int y = ((int)Math.pow(x, 2)) - 3 * x + 7;
		System.out.println("x=" + x + ", y=" + y);
		
		//Q4
		System.out.print("논리 연산을 입력하세요 >>");
		
		boolean a = scanner.nextBoolean();
		String op = scanner.next();
		boolean b = scanner.nextBoolean();
		
		switch(op) { 
		 case"AND" : 
			 System.out.println(a && b);
			 break;
		 case "OR" :
			 System.out.println(a || b);
			 break;
		}
			 
		//Q5
		System.out.print("돈의 액수를 입력하세요>>");
				
		int c = scanner.nextInt();
				
		int fifty = c / 50000;
			System.out.print("오만원" + fifty + "개 ");
				
		int ten = (c % 50000) / 10000;
			System.out.print("만원" + ten + "개 ");
		
		int five = (c % 10000) / 5000;
			System.out.print("오천원" + five + "개 ");
				
		int four = (c % 5000) / 1000;
			System.out.print("천원" + four + "개 ");
				
		int three = (c % 1000) / 500;
			System.out.print("500백" + three + "개 ");
				
		int two = (c % 500) / 100;
			System.out.print("100원" + two + "개 ");
				
		int one = (c % 100) / 10;
			System.out.print("오천원" + one + "개 ");
				
		int zero = (c % 10) / 1;
			System.out.println("1원" + zero + "개 ");
		
		//Q6
		System.out.print("학점을 입력하세요>>");
		
		String score = scanner.next();
		
		switch(score) {
		case "A" : case"B" : 
			System.out.println("Excellent");
			break;
		case "C" : case"D" :
			System.out.println("Good");
			break;
		case "F" : 
			System.out.println("Bye");
			break;
		default:
			System.out.println("다른 학점을 입력해주세요.");
		}
			
		//Q7
			System.out.print("커피 주문하세요>>");

			String coffee = scanner.next();
			int count = scanner.nextInt();
			
			if(coffee.equals("에스프레소")) {
				System.out.println(count * 2000 + "원입니다.");
			} else if(coffee.equals("아메리카노")) {
				System.out.println(count * 2500 + "원입니다.");
			} else if(coffee.equals("카푸치노")) {
				System.out.println(count * 3000 + "원입니다.");
			} else if(coffee.equals("카페라떼")) {
				System.out.println(count * 3500 + "원입니다.");
		    } else {
		    	System.out.println("해당 커피는 없습니다.");
		    }
			
			
			System.out.print("커피 주문하세요>>");
			
			String coffee1 = scanner.next();
			int count1 = scanner.nextInt();
			
			switch(coffee1) {
			case "에스프레소" : 
				System.out.println(2000*count1 + "원입니다.");
				break;
			case "아메리카노" : 
				System.out.println(2500*count1 + "원입니다.");
				break;
			case "카푸치노" : 
				System.out.println(3000*count1 + "원입니다.");
				break;
			case "카페라뗴" : 
				System.out.println(3500*count1 + "원입니다.");
				break;
			default :
				System.out.println("해당 커피는 없습니다.");
			}
	}
}

