package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		int i = 10;
		double j = 2.0;
		int inum = (int)j;
		
		int jnum = i + inum;
		System.out.println(jnum);
		System.out.println(i+j);
		
		char c ='\uAE00';
		System.out.println(c);
		System.out.println((int)c);
		char c2 = 44544;
		System.out.println(c2);
	}

}
