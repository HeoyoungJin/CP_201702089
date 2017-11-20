package 과제;

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
		
		System.out.println("계좌1 정보 입력");
		System.out.print("계좌번호: ");
		a1.accountNumber = sc.nextLine();
		System.out.print("예금주: ");
		a1.owner = sc.nextLine();
		System.out.print("초기 잔액: ");
		a1.balance = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println("계좌2 정보 입력");
		System.out.print("계좌번호: ");
		a2.accountNumber = sc.nextLine();
		System.out.print("예금주: ");
		a2.owner = sc.nextLine();
		System.out.print("초기 잔액: ");
		a2.balance = sc.nextInt();
		System.out.println("계좌1에서 계좌2로 송금할 금액: ");
		if(a1.sendAccount(sc.nextInt(), a2)<0) 
			System.out.println("계좌 이체 실패");
		else {		
		System.out.println("계좌1");
		System.out.print("계좌번호: " + a1.accountNumber);
		System.out.print("\n예금주: " + a1.owner);
		System.out.println("\n잔액: " + a1.balance);
		System.out.println("계좌2");
		System.out.print("계좌번호: " + a2.accountNumber);
		System.out.print("\n예금주: " + a2.owner);
		System.out.print("\n잔액: " + a2.balance);
		
	}
	}
}
