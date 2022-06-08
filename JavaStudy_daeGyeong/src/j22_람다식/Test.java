package j22_람다식;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		list.forEach(System.out::println);
		
		ArrayList<Integer> changeList = list.stream().map(o -> o + 10).collect(Collectors.toCollection(ArrayList::new));
		
	}
}