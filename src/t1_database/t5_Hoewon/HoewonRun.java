package t1_database.t5_Hoewon;

import java.util.Scanner;

// 회원관리 프로그램 최종본.^^..(20250715_1636)
public class HoewonRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HoewonService service = new HoewonService();
		
		boolean run = true;
		
		while(run) {
			System.out.print("==> 1:회원가입  2:전체조회 3:개별조회  4:회원수정 5:회원삭제  0:종료? ");
			int choice = scanner.nextInt();
		
			switch (choice) {
				case 1: //회원가입
					service.setHoewonInput();
					break;
				case 2: //전체조회
					service.getHoewonList();
					break;
				case 3: //개별조회
					service.getHoewonSearch();
					break;
				case 4: //수정처리
					service.setHoewonUpdate();
					break;
				case 5: //삭제처리
					service.setHoewonDelete();
					break;
				default:
					service.connClose();
					run = false;
			}
		}
		System.out.println("작업을 종료합니다.^^.1^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.2^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.3^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.4^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.5^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.6^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.7^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.8^^^^^^^.....");
		System.out.println("작업을 종료합니다.^^.9^^^^^^^.....");
		
		scanner.close();
	}
}
