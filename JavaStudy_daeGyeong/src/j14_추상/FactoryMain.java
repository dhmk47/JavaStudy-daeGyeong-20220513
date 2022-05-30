package j14_추상;

public class FactoryMain {
	public static void main(String[] args) {
		
		// Factory클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성.
		Factory[] factorys = new Factory[2];
		factorys[0] = new LGFactory();			// 업캐스팅
		factorys[1] = new SamsungFactory();		// 업캐스팅
		
		for(Factory factory : factorys) {		// foreach: 처음부터 끝까지 반복
			factory.start();
		}
		
		for(Factory factory : factorys) {
			factory.stop();
		}
		
	}
}