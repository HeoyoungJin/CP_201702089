package ����;

import java.util.Scanner;

public class �ð� {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȯ�� �� �Է�: ");
		a = sc.nextInt();
		
		b = a/3600;
		c = (a-b*3600)/60;
		d = a % 60;
		System.out.println(b+"�ð�"+c+"��"+d+"��");
		sc.close();

	}

}
