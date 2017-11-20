package 과제;

import java.util.Scanner;

public class 알파벳구분 {

	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("문자: ");
		a = sc.nextLine();
		switch(a) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("모음.");
			break;
			
	    default:
	    	System.out.println("자음.");
		
		}
		

	}

}
