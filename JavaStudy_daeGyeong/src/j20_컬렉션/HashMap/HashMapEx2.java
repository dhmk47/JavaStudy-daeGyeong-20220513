package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class HashMapEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = null;
		
		System.out.print("찾으실 값을 입력하세요: ");
		value = sc.nextLine();
		
		/*
		 * 자동차	-> car
		 * 자전거	-> bicycle
		 * 기차		-> train
		 * 비행기	-> airplane
		 * 
		 * 지원하지 않는 단어입니다.
		 */
		
		String result = null;
		
		if(value.equals("자동차")) {
			result = "car";
		}else if(value.equals("자전거")) {
			result = "bicycle";
		}else if(value.equals("기차")) {
			result = "train";
		}else if(value.equals("비행기")) {
			result = "airplane";
		}else {
			result = "지원하지 않는 단어입니다.";
		}
		
		System.out.println(result);
		
		
		HashMap<String, String> words = new HashMap<String, String>();
		words.put("자동차", "car");
		words.put("자전거", "bicycle");
		words.put("기차", "train");
		words.put("비행기", "airplane");
		words.put("버스", "bus");
		words.put("오토바이", "motorcycle");
		
		if(words.containsKey(value)) {
			System.out.println(words.get(value));
		}else {
			System.out.println("지원하지 않는 단어입니다.");
		}
	}
}