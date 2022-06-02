package j19_제네릭;

import j12_상속.동물.Human;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser().toString());
		System.out.println(controller.updateUser());
		System.out.println(controller.getUser().getData());
		
		controller.getAnimal().getData().move();
		
//		controller.getAnimal().getData().readBooks();
		// return 될때 Animal로 업캐스팅 되어서 반환해주기때문에 다운캐스팅 필요
		((Human) controller.getAnimal().getData()).readBooks();
		
		
//		System.out.println(((CMrespDto<User>) controller.getUser()).getData());
	}
}