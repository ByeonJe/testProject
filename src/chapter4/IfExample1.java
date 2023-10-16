package chapter4;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60;
		char grade;
		if (score >= 90) {
			grade = 'A';
			System.out.println(grade);
		} else if (score >= 80) {
			grade = 'B';
			System.out.println(grade);
		} else if (score >= 70) {
			grade = 'C';
			System.out.println(grade);
		} else if (score >= 60) {
			grade = 'D';
			System.out.println(grade);
		} else {
			grade = 'F';
			System.out.println(grade);
		}

		System.out.println("학점은 " + grade + " 입니다.");

		char grade2 = 
				(score >= 90) ? 'A' :
					(score >= 80) ? 'B' :
						(score >= 70) ? 'C' :
							(score >= 60) ? 'D' : 'F';

		System.out.println("학점은 " + grade2 + " 입니다.");
	}

}
