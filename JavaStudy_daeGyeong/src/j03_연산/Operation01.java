package j03_연산;

public class Operation01 {
	public static void main(String[] args) {
		int num = 10;
		num = num + 1;
		
		System.out.println(num++);
		System.out.println(num);
		
		System.out.println(--num);	// 선감소
		System.out.println(num--);	// 후감소
		System.out.println(num);	// 후감소 처리된 num
		
	}
}