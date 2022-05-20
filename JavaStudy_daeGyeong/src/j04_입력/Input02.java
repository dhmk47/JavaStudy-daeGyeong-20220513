package j04_입력;

import java.util.Scanner;

public class Input02 {
	public static void main(String[] args) {
		/*
		 * 문자열1 입력: nextLine()			hi
		 * 문자열2 입력: next()				안녕
		 * 문자 입력: next().charAt(0)		A
		 * 정수 입력: nextInt()				10
		 * 실수 입력: nextDouble()			3.14
		 */
		Scanner sc = new Scanner(System.in);
		
		String str1 = null;
		String str2 = null;
		char c = 0;
		int num = 0;
		double d = 0;
		
		System.out.print("문자열1 입력: ");
		str1 = sc.nextLine();
		
		System.out.print("문자열2 입력: ");
		str2 = sc.next();
		
		System.out.print("문자 입력: ");
		c = sc.next().charAt(0);
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		
		System.out.print("실수 입력: ");
		d = sc.nextDouble();
		
		System.out.println("문자열1: " + str1);
		System.out.println("문자열2: " + str2);
		System.out.println("문자: " + c);
		System.out.println("정수: " + num);
		System.out.println("실수: " + d);
		
	}
}