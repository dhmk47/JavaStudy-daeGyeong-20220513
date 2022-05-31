package j17_스태틱.student;

public class Student {
	/*
	 * student_code(정수)
	 * student_name(이름)
	 * student_year(학년)
	 * 
	 * 학생을 한명 생성할때마다 자동으로 student_code의 값이 1씩 증가하여 부여될 수 있게 작성.
	 * 20220001
	 * 20220002
	 */
	private static int auto_increment = 20220000;
	private int student_code;
	private String student_name;
	private int student_year;
	
	public Student(String student_name, int student_year) {
		this.student_code = ++auto_increment;
		this.student_name = student_name;
		this.student_year = student_year;
	}
	
	public void showInfo() {
		System.out.println("학번: " + student_code);
		System.out.println("이름: " + student_name);
		System.out.println("학년: " + student_year);
		System.out.println();
	}

}