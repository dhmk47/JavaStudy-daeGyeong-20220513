package j03_연산;

public class Operation8 {
	public static void main(String[] args) {
		/*
		 * num = 10
		 * num이 짝수면 짝수, 홀수면 홀수를 출력하는 프로그램을 작성하세요.
		 */
		
		int num = 11;
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
	}
}