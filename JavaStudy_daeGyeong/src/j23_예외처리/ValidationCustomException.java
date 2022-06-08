package j23_예외처리;

public class ValidationCustomException extends RuntimeException {
	
	/**
	 * 객체를 구분하기 위한 변수
	 * 다른 프로그램이랑 우리 프로그램이랑 연결할때 사용
	 */
	private static final long serialVersionUID = 1L;

	public ValidationCustomException() {
		super();
		System.out.println("우리가 만든 예외입니다");
	}
	
	public ValidationCustomException(String message) {
		super(message);
		System.out.println("우리가 만든 예외 메세지가 있습니다.");
	}
	
}