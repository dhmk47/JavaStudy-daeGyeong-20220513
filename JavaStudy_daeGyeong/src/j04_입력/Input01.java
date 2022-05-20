package j04_입력;

import java.util.Scanner;

public class Input01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num1값 입력: ");
		int num1 = sc.nextInt();
		System.out.print("num2값 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("num1 + num2: " + (num1 + num2));
		
		sc.next();				// 문자열 (String)
		sc.nextLine();			// 문자열 (String)
		sc.next().charAt(0);	// 문자 (char)
		sc.nextInt();			// 정수 (int)
		sc.nextDouble();		// 실수 (double)
	}
}