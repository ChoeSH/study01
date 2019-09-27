package study01.test03;

import java.util.Scanner;	//scanner를 사용하기 위한 명령어

public class HowOldRU {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//scan변수의 선언 Scanner scan= new Scanner(System.in);
		System.out.println("너 몇살이야?");
		String age = scan.nextLine();	//String age = scan.nextLine(); age값을 입력받고 enter를 누르기전 값을 저장
		System.out.println("난 "+age+"살 이야");
		int num = Integer.parseInt(age);	//age값을 int형식으로 변환
				
	}
}

//형상관리툴 : git, Svn, starteam
//gitignore