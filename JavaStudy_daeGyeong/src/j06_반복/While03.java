package j06_반복;

import java.util.Scanner;

public class While03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		
		System.out.print("반복 횟수를 입력하세요: ");
		num = sc.nextInt();
		
		while(i < num) {
			System.out.println(i + 1);
			i++;
		}
		
		i = 0;
		
		while(i < num) {
			System.out.println(num - i);
			i++;
		}
	}
}