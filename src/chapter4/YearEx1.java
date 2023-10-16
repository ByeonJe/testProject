package chapter4;

import java.util.Scanner;

public class YearEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int year = scanner.nextInt();
		
		if (year%400==0) {
			System.out.println(year + "년은 윤녀 입니다.");
		} else if (year%100==0) {
			System.out.println(year + "년은 유년이 아닙니다.");
		} else if (year%4==0) {
			System.out.println(year + "년은 유년이 아닙니다.");
		} else {
			System.out.println(year + "년은 유년이 아닙니다.");
			
		}
	}

}
