package j12_상속;

public class Test1 extends Test{
	public Test1() {
		super(); // 부모클래스 생성 (super() 는 기본적으로 생략이 되어있습니다.)
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인: " + super.toString());
	}
	
}