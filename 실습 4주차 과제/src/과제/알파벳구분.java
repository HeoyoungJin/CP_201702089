package ����;

import java.util.Scanner;

public class ���ĺ����� {

	public static void main(String[] args) {
		String a;
		Scanner sc = new Scanner(System.in);
		System.out.println("����: ");
		a = sc.nextLine();
		switch(a) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("����.");
			break;
			
	    default:
	    	System.out.println("����.");
		
		}
		

	}

}
