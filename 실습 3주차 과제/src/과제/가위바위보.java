package ����;

import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		String a;
		int i = 1;
		int count1 = 1;
		int count2 = 0;
		int count3 = 0;
		int uN = (int)(Math.random()*9) + 1;
		Scanner sc = new Scanner(System.in);
		for(i = 1; i<=7; i++) {
			System.out.println("stage" + count1 + " ����: " + count2 + "��" + "vs" + "��ǻ��: " + count3 + "��");
		System.out.println("����,����,�� �� �ϳ��� �Է��ϼ���: ");
		a = sc.nextLine();
		if(a.equals("����")) {
			System.out.println("���� ����");
			if(uN == 1 || uN == 4 || uN == 7) {
				System.out.println("��ǻ�� ����");
				System.out.println("����!");
			}
			else if(uN == 2 || uN == 5 || uN == 8) {
				System.out.println("��ǻ�� ����");
				System.out.println("����!");
				count3++;
			}
			else if(uN == 3 || uN == 6 || uN == 9) {
				System.out.println("��ǻ�� ��");
				System.out.println("�̰��!");
				count2++;
			}
		}
		else if(a.equals("����")) {
			System.out.println("���� ����");
			if(uN == 1 || uN == 4 || uN == 7) {
				System.out.println("��ǻ�� ����");
				System.out.println("�̰��!");
				count2++;
			}
			else if(uN == 2 || uN == 5 || uN == 8) {
				System.out.println("��ǻ�� ����");
				System.out.println("����!");
			}
			else if(uN == 3 || uN == 6 || uN == 9) {
				System.out.println("��ǻ�� ��");
				System.out.println("����!");
				count3++;
			}
		}
		else if(a.equals("��")) {
			System.out.println("���� ��");
			if(uN == 1 || uN == 4 || uN == 7) {
				System.out.println("��ǻ�� ����");
				System.out.println("����!");
				count3++;
			}
			else if(uN == 2 || uN == 5 || uN == 8) {
				System.out.println("��ǻ�� ����");
				System.out.println("�̰��!");
				count2++;
			}
			else if(uN == 3 || uN == 6 || uN == 9) {
				System.out.println("��ǻ�� ��");
				System.out.println("����!");
			}
		}
		count1++;
	}
}
}
