package j23_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외				->	(프로그램이 실행 중)	RuntimeException
 * 2. 컴파일 중 에러	->	ex) 드라이버			IOException
 * 3. 버그				->	외부로부터의 오작동		게임에서 핵 같은...
 */

public class ArrayException01 {
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		try {
			for(int i = 0; i < numbers.length + 1; i++) {
				System.out.println("index" + i + ": " + numbers[i]);
			}
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였습니다.");
		}catch (Exception e) {	// 모든 예외클래스의 최상위 클래스입니다. 그러므로 모든 예외가 여기서 잡힙니다.
			System.out.println(e);
		}
		
		System.out.println("지금가지 진행한 작업을 저장합니다.");
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
	}
}