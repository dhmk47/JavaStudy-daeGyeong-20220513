package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		String[] strArray = new String[5];
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";
		
		for(String str : strArray) {
			System.out.println(str);
		}
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("b1");
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		strArrayList.add("b6");
		
		System.out.println(strArrayList.size());
		for(String str : strArrayList) {
			System.out.println(str);
		}
		
		System.out.println();
		
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		System.out.println();

		strArrayList.remove("b1");
		strArrayList.remove(0);
		
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i));
		}
		
		
		
//		ArrayList<String> arr = Stream.of("a", "b", "c").collect(Collectors.toCollection(ArrayList::new));
//		ArrayList<String> arr = Stream.of("a", "b", "c").collect(Collectors.toCollection(() -> new ArrayList<String>));
//		
//		arr.forEach(System.out::println);
	}
}