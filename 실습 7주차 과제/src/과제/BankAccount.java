package ����;

import java.util.Scanner;

public class BankAccount {
	String accountNumber;
	String owner;
    int balance;
    
    public BankAccount() {
    	accountNumber = "";
    			owner = "";
    			balance = 0;
    }
	
	void deposit(int amount) {
		balance += amount;
	}
	void withdraw(int amount) {
		balance -= amount;
	}
	public String toString() {
		return String.valueOf(balance);
	}
	public int sendAccount(int amount, BankAccount otherAccount) {
		if(amount >= balance) {
			return -1;
		}else {
			withdraw(amount);
			otherAccount.deposit(amount);
			return balance;
		}
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		System.out.println("����1 ���� �Է�");
		System.out.print("���¹�ȣ: ");
		a1.accountNumber = sc.nextLine();
		System.out.print("������: ");
		a1.owner = sc.nextLine();
		System.out.print("�ʱ� �ܾ�: ");
		a1.balance = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println("����2 ���� �Է�");
		System.out.print("���¹�ȣ: ");
		a2.accountNumber = sc.nextLine();
		System.out.print("������: ");
		a2.owner = sc.nextLine();
		System.out.print("�ʱ� �ܾ�: ");
		a2.balance = sc.nextInt();
		System.out.println("����1���� ����2�� �۱��� �ݾ�: ");
		if(a1.sendAccount(sc.nextInt(), a2)<0) 
			System.out.println("���� ��ü ����");
		else {		
		System.out.println("����1");
		System.out.print("���¹�ȣ: " + a1.accountNumber);
		System.out.print("\n������: " + a1.owner);
		System.out.println("\n�ܾ�: " + a1.balance);
		System.out.println("����2");
		System.out.print("���¹�ȣ: " + a2.accountNumber);
		System.out.print("\n������: " + a2.owner);
		System.out.print("\n�ܾ�: " + a2.balance);
		
	}
	}
}
