package 과제;

import java.util.Scanner;

public class 요일구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도: ");
		int y = sc.nextInt();
		System.out.print("월: ");
		int m = sc.nextInt();
		System.out.print("일: ");
		int d = sc.nextInt();
		int allday = 0;
		int yy = 0;
		
		for(int i = 1900; i<y; i++) {
			if(i % 4 == 0) {
				yy = 1;
				if(i % 100 == 0) {
					yy = 0;
					if(i % 400 == 0) {
						yy = 1;
					}
				}
			}
			if(yy == 1) {
				allday = allday + 366;
			}else {
				allday = allday + 365;
			}
		}
		yy=0;
		for(int i=1; i<m; i++) {
		if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
			allday = allday + 31;
		}else if(i == 4 || i == 6 || i == 9 || i == 11) {
			allday = allday + 30;
		}else{
			if(i % 4 == 0) {
				yy = 1;
				if(i % 100 == 0) {
					yy = 0;
					if(i % 400 == 0) {
						yy = 1;
					}
				}
			}
		if(yy==1) {
			allday = allday + 29;
		}else {
			allday = allday + 28;
		}
		}
		}
		allday = allday + d;
		if(allday % 7 == 1) {
			System.out.println("월");
		}else if(allday % 7 == 2) {
			System.out.println("화");
		}else if(allday % 7 == 3) {
			System.out.println("수");
		}else if(allday % 7 == 4) {
			System.out.println("목");
		}else if(allday % 7 == 5) {
			System.out.println("금");
		}else if(allday % 7 == 6) {
			System.out.println("토");
		}else if(allday % 7 == 0) {
			System.out.println("일");
		}

	}
	}