package j19_제네릭;

import j10_클래스기본정리.repository.User;
import j12_상속.동물.Animal;
import j12_상속.동물.Human;
import j12_상속.동물.Tiger;

public class Controller {
	
	public Object createUser() {
		// 데이터를 전송해 줄 수 있는 하나의 묶음
		return new CMrespDto<String>(1, "회원추가 성공", "aaaa, 1234");
	}
	
	public Object updateUser() {
		return new CMrespDto<Integer>(1, "회원정보(나이) 수정 성공", 29);
	}
	
	// 제네릭의 와일드카드
	public CMrespDto<?> getUser() {
		User user = new User();
		user.setUsercode("2");
		user.setUsername("dhmk47");
		user.setPassword("1234");
		user.setName("한대경");
		user.setEmail("dhmk47@naver.com");
		
//		return user.getUsercode().equals("1") ? new CMrespDto<User>(1, "회원정보 가져오기 성공", user) 
//				: new CMrespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		
		if(user.getUsercode().equals("1")) {
			return new CMrespDto<User>(1, "회원정보 가져오기 성공", user);
		}else {
			return new CMrespDto<String>(-1, "회원정보 가져오기 실패", "usercode = 2");
		}
		
	}
	
	// 와일드카드에서 제약을 거는 방법
	// Animal을 상속받은 객체만 리턴 가능
	// return 할때 자동으로 업캐스팅 되어서 반환됩니다.
	public CMrespDto<? extends Animal> getAnimal(){
		Animal animal = new Human();

		if(animal instanceof Human) {
			// 여기서 다운캐스팅 해서 return해도 결국 업캐스팅해서 return 됩니다.
			// 이건 그냥 예시입니다.
			return new CMrespDto<Human>(1, "사람입니다.", (Human) animal);
		}else if(animal instanceof Tiger) {
			return new CMrespDto<Tiger>(1, "호랑이입니다.", (Tiger) animal);
		}else {
			// <> 비어있다면 객체의 자료형을 따라갑니다.
			return new CMrespDto<>(-1, "찾을 수 없는 동물", animal);
		}
	}
}