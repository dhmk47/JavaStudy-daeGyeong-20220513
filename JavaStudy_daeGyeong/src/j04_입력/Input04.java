package j04_입력;

import java.util.Scanner;

public class Input04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String summary = null;
		String director = null;
		String rank = null;
		String popularMovie = null;
		String movieInfo1 = null;
		String movieInfo2 = null;
		
		System.out.print("개요: ");
		summary = sc.nextLine();
		
		System.out.print("감독: ");
		director = sc.nextLine();
		System.out.print("등급: ");
		rank = sc.nextLine();
		System.out.print("흥행: ");
		popularMovie = sc.nextLine();
		System.out.print("줄거리: ");
		movieInfo1 = sc.nextLine();
		movieInfo2 = sc.nextLine();
		
		System.out.println("개요: " + summary);
		System.out.println("감독: " + director);
		System.out.println("등급: " + rank);
		System.out.println("흥행: " + popularMovie);
		System.out.println("줄거리: " + movieInfo1 + "\n" + movieInfo2);
	}
}