package 과제;

import java.util.Scanner;

public class 시간 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("변환할 초 입력: ");
		a = sc.nextInt();
		
		b = a/3600;
		c = (a-b*3600)/60;
		d = a % 60;
		System.out.println(b+"시간"+c+"분"+d+"초");
		sc.close();

	}

}
