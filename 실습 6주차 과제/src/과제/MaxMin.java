package ����;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		int max = 0;
		int min = 101;
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			a[i] = sc.nextInt();
			if(a[i]>max) 
				max = a[i];
		}
		System.out.println("���� ū ����: " + max);
		for(int i = 0; i<10; i++) {
			if(a[i]<min)
				min = a[i];
	}
		System.out.println("���� ���� ����: " + min);
	}
}
