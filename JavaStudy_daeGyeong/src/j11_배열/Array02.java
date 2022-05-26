package j11_배열;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
//		int size = 4;
//		int[] numbers = new int[size];
//		
//		System.out.println(numbers.length);
		
		/*
		 * for문으로 0 ~ 99까지 반복을 합니다.
		 * 변수 i의 값이 8의 배수이면
		 * 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입합니다.
		 * 배열에 들어있는 8의 배수들을 모두 출력하시오
		 */
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int count = 0;
		
		System.out.print("정수 입력: ");
		num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < 100; i++) {
			if(i % num == 0 && i != 0) {
				count++;
				
			}
		}
		
		int[] intArr = new int[count];
//		int index = 0;
		
		for(int i = 0, j = 0; i < 100; i++) {
			if(i % num == 0 && i != 0) {
				intArr[j] = i;
				System.out.println(intArr[j]);
				j++;
//				intArr[index] = i;
//				index++;
				
			}
		}
		
//		for(int i = 0; i < intArr.length; i++) {
//			System.out.println(intArr[i]);
//			
//		}
	}
}