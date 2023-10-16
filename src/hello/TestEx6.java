package hello;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
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
		
			

	}

}
