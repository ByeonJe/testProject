package chapter4;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int floor = 2;
		String place;
		
		switch(floor) {
			case 1 : place = "약국";
					 break;
			case 2 : place = "정형외과";
					 break;
			case 3 : place = "피부과";
					 break;
			case 4 : place = "치과";
					 break;
			case 5 : place = "헬스 클럽";
					 break;
			
			default:
					place = "없습니다.";
		}
		System.out.println(floor + "층 " + place + "입니다.");
	}

}
