package op;

import java.util.Scanner;

public class Ws3 {

	public static void main(String[] args) {
//		// Scanner �� ���� �� ���� �Է� �޴´�.
//		System.out.println("Type a number");
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		sc.close();
//		// �Է¹��� �� ���� ���� �� �ִ��� ����Ͻÿ�.
//		int a_num = Integer.parseInt(a);
//		int data = 100;
//		// �Է� ���� ���� 0���� ������ data�� 10�� ���ϰ�
//		// �׷��� ������ 1�� ���Ѵ�.
//		
//		data *= ((a_num < 0) ? 10 : 1); 
//		
//		System.out.println(data);		
	
	int fah = 100;
	float cel = (float)5/9 * (fah-32);
	cel = ((int)(cel * 1000) % 10) >= 5 ?
			((int)(cel * 1000) + 10) / 10 :
			(int)(cel * 1000) / 10;
	cel = cel/100;
		
	//float C = ((1000 * (fah - 32) * 5 / 9 + 5) / 10) / 100f;
		
	//System.out.println(C);
	System.out.println("Fahrenheit: "+fah);
	System.out.println("Celcius: "+cel);
	
	}

}