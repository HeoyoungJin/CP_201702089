package ����;

import java.util.Scanner;

public class TestDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int y = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ�: ");
		int m = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ�: ");
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
		System.out.println("����� ��¥ ǥ����: " + year + "." + month + "." + day);
	}
		void printWestern() {
			System.out.println("�̱��� ��¥ ǥ����: " + mon[month] + "." + day + "." + year);
		}
}

