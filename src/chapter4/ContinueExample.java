package chapter4;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0)
				continue;
			total += num;
			System.out.println(total);
		}
		System.out.println("1부터 10까지의 합은 " + total + "입니다.");

	}

}
