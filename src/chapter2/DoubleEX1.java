package chapter2;

public class DoubleEX1 {

	public static void main(String[] args) {
//		double dnum = 3.14;
		float fnum = 3.14F;
		
//		System.out.println(dnum);
		System.out.println(fnum);
		
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
		}
		System.out.println(dnum);
		}

	}
