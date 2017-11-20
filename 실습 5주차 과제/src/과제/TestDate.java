package 과제;

import java.util.Scanner;

public class TestDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하시오: ");
		int y = sc.nextInt();
		System.out.print("월을 입력하시오: ");
		int m = sc.nextInt();
		System.out.print("일을 입력하시오: ");
		int d = sc.nextInt();
		Date Date = new Date(y, m, d);
		Date.printEastern();
		Date.printWestern();
	}
}
		class Date{
			int year;
			int month;
			int day;
			Date(int y, int m, int d){
				this.year = y;
				this.month = m;
				this.day = d;
			}
			String[] mon = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		void printEastern(){
		System.out.println("동양식 날짜 표현은: " + year + "." + month + "." + day);
	}
		void printWestern() {
			System.out.println("미국식 날짜 표현은: " + mon[month] + "." + day + "." + year);
		}
}

