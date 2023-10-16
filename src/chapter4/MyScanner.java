package chapter4;

import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		String str;
		
		if(i==1) {
			str = "약국";
		} else if (i==2) {
			str = "정형외과";
		} else if (i==3) {
			str = "피부과";
		} else if (i==4) {
			str = "치과";
		} else if (i==5) {
			str = "헬스 클럽";
		} else {
			str = "없습니다.";
		}
		
		System.out.println(i + "층 " + str + "입니다.");
		
	}

}
