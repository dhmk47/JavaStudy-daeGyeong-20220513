package j17_스태틱.student;

public class StudentMain {
	public static void main(String[] args) {
//		int code = 20220000;
		
		Student stu = new Student("한대경", 1);
		Student stu2 = new Student("둘대경", 2);
		Student stu3 = new Student("삼대경", 3);
		Student stu4 = new Student("넷대경", 1);
		Student stu5 = new Student("오대경", 3);
		
		stu.showInfo();
		stu2.showInfo();
		stu3.showInfo();
		stu4.showInfo();
		stu5.showInfo();
		
	}
}