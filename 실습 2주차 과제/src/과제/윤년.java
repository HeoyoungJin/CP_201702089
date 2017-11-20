package 과제;

import java.util.Scanner;

public class 윤년 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하시오: ");
		a = sc.nextInt();
		
		if(a%4 ==0 && a%100 !=0 ) {
			System.out.println(a+"년은 윤년입니다.");
		}
		else if(a%400==0) {
			System.out.println(a+"년은 윤년입니다.");
		}
		else 
			System.out.println(a+"년은 윤년이 아닙니다.");
		
	}

}
