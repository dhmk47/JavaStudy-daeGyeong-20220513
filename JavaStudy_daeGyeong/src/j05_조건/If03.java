package j05_조건;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		/*
		 * 0보다 작거나 100보다 크면 계산 할 수 없는 점수입니다. 출력
		 */
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String result = null;
		
		System.out.print("점수 입력: ");
		score = sc.nextInt();
		sc.nextLine();
		
		if(score < 0 || score > 100) {
			result = "0보다 작거나 100보다 크면 계산 할 수 없는 점수입니다.";
		}else if(score > 89) {
			result = "A";
		}else if(score > 79) {
			result = "B";
		}else if(score > 69) {
			result = "C";
		}else if(score > 59) {
			result = "D";
		}else{
			result = "F";
		}
		
		System.out.println(result);
	}
}