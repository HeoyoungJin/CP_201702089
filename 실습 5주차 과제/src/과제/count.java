package 과제;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		String user_input;
		int mo = 0,ja = 0;
		int i;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳을 입력하시오: ");
		user_input = scan.nextLine();
		
		for(i=0; i<user_input.length(); i++) {
			if(user_input.charAt(i)=='a' || user_input.charAt(i)=='e' || user_input.charAt(i)=='i' || user_input.charAt(i)=='o' || user_input.charAt(i)=='u') {
				mo++;
			}else {
				ja++;
			}
		}
		System.out.println("모음의 개수: " + mo);
		System.out.println("자음의 개수: " + ja);
	}
}
