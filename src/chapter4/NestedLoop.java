package chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int times;

//		for (dan = 2; dan <= 9; dan++) {
//			for (times = 1; times <= 9; times++) {
//				if(dan % 2 != 0) {
//					continue;
//				}
//				System.out.println(dan + " X " + times + " = " + dan * times);
//			}
			
			for (dan = 2; dan <= 9; dan++) {
				for (times = 1; times <= 9; times++) {
					System.out.println(dan + " X " + times + " = " + dan * times);	
					if (times >= dan) {
						break;
					}
				}
			System.out.println( );
			}
	}
}
