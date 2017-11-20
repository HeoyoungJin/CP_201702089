package 과제;

public class 피보나치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0;
		int a2 = 1;
		int a3;
		
		System.out.print(a1+ " " + a2 +" ");
		for(int i=0; i<8; i++) {
			a3 = a2 + a1;
			
			System.out.print(a3 + " ");
			a1 = a2;
			a2 = a3;
		}

	}

}
