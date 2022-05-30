package j14_추상;

/*
 * abstract(추상)
 * 
 * 추상 메소드
 * 1. return type 앞에 abstract 키워드가 붙습니다.
 * 2. 추상 메소드는 일반 클래스 안에 선언 할 수 없습니다.
 * 3. 상속 또는 구현된 클래스에서 무조건 override(재정의)가 되어야합니다.
 * 
 * 추상 클래스
 * 1. 클래스 type 앞에 abstract 키워드가 붙습니다.
 * 2. 추상 클래스는 생성 할 수 없습니다.
 * 3. 추상 메소드를 포함 할 수 있습니다. 하지만 추상 메소드를 꼭 포함하지는 않아도 됩니다.
 */

// 추상 클래스
public abstract class Factory {
	
	// 추상 메소드
	public abstract void start();
	
	// 일반 메소드
	public void stop() {
		System.out.println("공장을 멉춥니다.");
	}
}