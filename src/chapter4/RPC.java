package chapter4;

import java.util.Scanner;

public class RPC {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int player = scanner.nextInt();
		int computer = (int)(Math.random()*3);
		String str = "";
		
		if (player == 0) {
			if (computer == 0) {
				str = "무승부";
			} else if (computer == 1) {
				str = "패";
			} else if (computer == 2) {
				str = "승";
			}
		} else if (player == 1) {
			if (computer == 0) {
				str = "승";
			} else if (computer == 1) {
				str = "무승부";
			} else if (computer == 2) {
				str = "패";
			}
		} else if (player == 2) {
			if (computer == 0) {
				str = "패";
			} else if (computer == 1) {
				str = "승";
			} else if (computer == 2) {
				str = "무승부";
			}
		} else {
			str = "오류";
		}
		
		System.out.println(player);
		System.out.println(computer);
		System.out.println(str);

	}

}
