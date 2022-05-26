package j10_클래스기본정리.service;

import java.util.Scanner;

import j10_클래스기본정리.repository.User;

public class UserService {
	
	// 선언만 하고 객체생성할때 생성을 한 이유는
	// 프로그램이 컴파일하는 과정에서 스캐너를 생성하게 되서
	// 지금 사용하지 않지만 생성을 해버려서 메모리 낭비를 하게 됩니다.
	private Scanner sc;
	
	public UserService() {
		sc = new Scanner(System.in);
	}

	public User insertUser() {
		showInsertView();
		String usercode = null;
		String email = null;
		String name = null;
		String username = null;
		String password = null;
		
		System.out.print("사용자 번호 입력: ");
		usercode = sc.nextLine();
		System.out.print("이메일: ");
		email = sc.nextLine();
		System.out.print("이름: ");
		name = sc.nextLine();
		System.out.print("사용자이름: ");
		username = sc.nextLine();
		System.out.print("비밀번호: ");
		password = sc.nextLine();
		
		User user = new User(usercode, email, name, username, password);
		return user;
	}
	
	private void showInsertView() {
		System.out.println("[사용자 추가]");
		System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
	}
}