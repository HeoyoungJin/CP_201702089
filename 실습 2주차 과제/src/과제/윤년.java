package ����;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��Ͻÿ�: ");
		a = sc.nextInt();
		
		if(a%4 ==0 && a%100 !=0 ) {
			System.out.println(a+"���� �����Դϴ�.");
		}
		else if(a%400==0) {
			System.out.println(a+"���� �����Դϴ�.");
		}
		else 
			System.out.println(a+"���� ������ �ƴմϴ�.");
		
	}

}
