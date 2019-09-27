package study01.test03;
import java.util.Random;
import java.util.Scanner;	//ctrl+shift+O

public class Lotto {

	public static void main(String[] args) {
		System.out.println("1번째 로또 번호를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		
		int num1=Integer.parseInt(scan.nextLine());
		System.out.println("입력한 첫번째 번호 : "+num1);
		
		int num2=Integer.parseInt(scan.nextLine());
		System.out.println("입력한 두번째 번호 : "+num2);
		
		int num3=Integer.parseInt(scan.nextLine());
		System.out.println("입력한 세번째 번호 : "+num3);
		
		int num4=Integer.parseInt(scan.nextLine());
		System.out.println("입력한 네번째 번호 : "+num4);
		
		int num5=Integer.parseInt(scan.nextLine());
		System.out.println("입력한 다섯번째 번호 : "+num5);
		
		int num6=Integer.parseInt(scan.nextLine());
		System.out.println("입력한 여섯번째 번호 : "+num6);
		
		
		Random r = new Random();
		System.out.println("\n이번주 로또 번호는 두둥~");
		int correctCnt=0;
		for(int i=1; i<=6; i++) {
			int rNum = r.nextInt(45)+1;	//nextInt(45)는 44까지의 수 +1을 해서 1~45까지의 수
			System.out.println(i+"번째 : "+rNum);
		if(rNum==num1 || rNum==num2 || rNum==num3 || rNum==num4 || rNum==num5 || rNum==num6) {
			correctCnt ++;
		}
		}
		System.out.println("총 맞은 갯수 : "+correctCnt);
	}
}
