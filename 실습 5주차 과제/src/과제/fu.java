package ����;

import java.util.Scanner;

public class fu {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ĺ��� �Է��Ͻÿ�: ");
		String alp;
		alp = sc.nextLine();
		
		for(int i=0; i<alp.length(); i++) {
			char ch = alp.charAt(i);
		if(ch >= 92 && ch<=122) {
			ch=(char)(ch-32);
			}else if(ch >= 65 && ch <= 90){
				ch=(char)(ch+32);
			}
		System.out.print(ch);
		}
	}
}

