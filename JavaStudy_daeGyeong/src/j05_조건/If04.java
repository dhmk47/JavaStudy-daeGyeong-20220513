package j05_조건;

import java.util.Scanner;

public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		String result = null;
		
		System.out.print("x좌표 입력: ");
		x = sc.nextInt();
		System.out.print("y좌표 입력: ");
		y = sc.nextInt();
		sc.nextLine();
		
		if((x < -1000 || x > 1000 || y < -1000 || x > 1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0)) {
			result = "계산 불가";
		}else if(x > 0 && y > 0) {
			result = "1사분면";
		}else if(x < 0 && y > 0) {
			result = "2사분면";
		}else if(x < 0 && y < 0) {
			result = "3사분면";
		}else if(x > 0 && y < 0) {
			result = "4사분면";
		}else {
			result = "원점";
		}
		System.out.println(result);
		
		String result1 = (x < -1000 || x > 1000 || y < -1000 || x > 1000 || x == 0 || y == 0) 
				&& (x != 0 || y != 0) ? "계산 불가" 
						: x > 0 && y > 0 ? "1사분면" 
								: x < 0 && y > 0 ? "2사분면"
										: x < 0 && y < 0 ? "3사분면"
												: x > 0 && y < 0 ? "4사분면" : "원점";
												
		System.out.println(result1);
	}
}