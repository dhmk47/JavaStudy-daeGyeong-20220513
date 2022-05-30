package j16_인터페이스_활용.service;

public class AuthUserService implements UserService{

	@Override
	public void create() {
		System.out.println("자회사 회원가입.");
	}

	@Override
	public void read() {
		System.out.println("자회사 회원가입을 통해 사용자 데이터 가져오기");
	}

	@Override
	public void update() {
		System.out.println("자회사 회원 정보 수정");
	}

	@Override
	public void delete() {
		System.out.println("자회사 회원 탈퇴");
	}
	// 다른 메소드가 필요하다면 private 으로 만들어서 여기서만 사용하게 해야합니다.
	// public으로 만들고 controller에서 사용한다면 그 다른 객체로 접근하게 되면 오류가 뜨기 때문에 소스코드를 고쳐야 하기 때문
}