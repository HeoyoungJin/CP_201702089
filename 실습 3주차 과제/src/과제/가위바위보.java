package 과제;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		String a;
		int i = 1;
		int count1 = 1;
		int count2 = 0;
		int count3 = 0;
		int uN = (int)(Math.random()*9) + 1;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i<=7; i++) {
			System.out.println("stage" + count1 + " 유저: " + count2 + "승" + "vs" + "컴퓨터: " + count3 + "승");
		System.out.println("가위,바위,보 중 하나를 입력하세요: ");
		a = sc.nextLine();
		if(a.equals("가위")) {
			System.out.println("유저 가위");
			if(uN == 1 || uN == 4 || uN == 7) {
				System.out.println("컴퓨터 가위");
				System.out.println("비겼다!");
			}
			else if(uN == 2 || uN == 5 || uN == 8) {
				System.out.println("컴퓨터 바위");
				System.out.println("졌다!");
				count3++;
			}
			else if(uN == 3 || uN == 6 || uN == 9) {
				System.out.println("컴퓨터 보");
				System.out.println("이겼다!");
				count2++;
			}
		}
		else if(a.equals("바위")) {
			System.out.println("유저 바위");
			if(uN == 1 || uN == 4 || uN == 7) {
				System.out.println("컴퓨터 가위");
				System.out.println("이겼다!");
				count2++;
			}
			else if(uN == 2 || uN == 5 || uN == 8) {
				System.out.println("컴퓨터 바위");
				System.out.println("비겼다!");
			}
			else if(uN == 3 || uN == 6 || uN == 9) {
				System.out.println("컴퓨터 보");
				System.out.println("졌다!");
				count3++;
			}
		}
		else if(a.equals("보")) {
			System.out.println("유저 보");
			if(uN == 1 || uN == 4 || uN == 7) {
				System.out.println("컴퓨터 가위");
				System.out.println("졌다!");
				count3++;
			}
			else if(uN == 2 || uN == 5 || uN == 8) {
				System.out.println("컴퓨터 바위");
				System.out.println("이겼다!");
				count2++;
			}
			else if(uN == 3 || uN == 6 || uN == 9) {
				System.out.println("컴퓨터 보");
				System.out.println("비겼다!");
			}
		}
		count1++;
	}
}
}
