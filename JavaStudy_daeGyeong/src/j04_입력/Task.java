package j04_입력;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		String result = null;
		
		System.out.print("연도 입력: ");
		year = sc.nextInt();

		result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년" : "윤년이 아닙니다";
		System.out.println(result);
	}
}