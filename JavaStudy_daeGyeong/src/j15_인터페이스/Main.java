package j15_인터페이스;

public class Main {
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		BeamProjector beamProjector = new BeamProjector();
		
		
//		int select = 2;
//		Hdmi choice = select == 1 ? new Monitor() : new BeamProjector();
//		SmartPhone smartPhone = new SmartPhone(choice);
		
		SmartPhone smartPhone = new SmartPhone(beamProjector);
		
		smartPhone.powerOn();
		smartPhone.powerOff();
	}
}