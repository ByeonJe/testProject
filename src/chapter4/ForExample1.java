package chapter4;

public class ForExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;

		for ( ; ; ) {
			sum += i;
			System.out.println(sum);
			if(i >= 10) {
				break;
			}
			i++;
		}

		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

	}

}
