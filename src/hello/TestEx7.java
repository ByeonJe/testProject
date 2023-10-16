package hello;

import java.util.Scanner;

public class TestEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
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
