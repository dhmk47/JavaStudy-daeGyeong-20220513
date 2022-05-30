package j14_추상;

public class FactoryMain2 {
	public static void main(String[] args) {
		LGFactory lgFactory = new LGFactory();
		lgFactory.start();
		lgFactory.stop();
		
//		Factory factory = new Factory(); 추상클래스는 생성 할 수 없습니다.
		
		SamsungFactory samsungFactory = new SamsungFactory();
		samsungFactory.start();
		samsungFactory.stop();
	}
}