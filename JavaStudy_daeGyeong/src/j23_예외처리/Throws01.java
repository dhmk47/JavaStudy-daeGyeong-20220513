package j23_예외처리;

public class Throws01 {
	
	// 예외를 미룹니다.
	// 그래서 이 메소드를 호출하면 예외처리를 해줘야합니다.
	// 이 메소드를 호출하면 예외가 발생할 수 있다고 알립니다.
	public void printArray(int[] arrays) throws Exception {
		
		for(int i = 0; i < arrays.length + 1; i++) {
			System.out.println("index" + i + ": " + arrays[i]);
		}
	}
}