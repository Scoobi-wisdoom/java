package op;

import java.util.Scanner;

public class Ws2 {

	public static void main(String[] args) {
//		// Scanner �� ���� �� ���� �Է� �޴´�.
//		System.out.println("Type a number");
//		Scanner sc = new Scanner(System.in);
//		String a = sc.nextLine();
//		System.out.println("Type 2nd number");
//		String b = sc.nextLine();
//
//		System.out.println("Type 3rd number");
//		String c = sc.nextLine();
//		sc.close();
//		// �Է¹��� �� ���� ���� �� �ִ��� ����Ͻÿ�.
//		int a_num = Integer.parseInt(a);
//		int b_num = Integer.parseInt(b);
//		int c_num = Integer.parseInt(c);
//		
//		//int maxNum = (a_num >= b_num) ? ((a_num >= c_num) ? a_num : c_num) : ((b_num >= c_num) ? b_num : c_num);
//		
//		int tmp = 0;
//		tmp = (a_num >= b_num) ? a_num : b_num;
//		int maxNum = 0;
//		maxNum = (tmp >= c_num) ? tmp : c_num;		
//		
//		System.out.println(maxNum);
		
		// Scanner �� ���� �� ���� �Է� �޴´�.
		System.out.println("Type a number");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Type 2nd number");
		String b = sc.nextLine();

		System.out.println("Type 3rd number");
		String c = sc.nextLine();
		sc.close();
		// �Է¹��� �� ���� ���� �� �ּڰ��� ����Ͻÿ�.
		int a_num = Integer.parseInt(a);
		int b_num = Integer.parseInt(b);
		int c_num = Integer.parseInt(c);
		
		int minNum = 0;
//		minNum = ((a_num <= b_num) ? a_num : b_num) <= c_num ? ((a_num <= b_num) ? a_num : b_num) : c_num;

		minNum = (a_num < b_num) ?
					((a_num < c_num) ? a_num : c_num) :
					((b_num < c_num) ? b_num : c_num) ;
		
		System.out.println(minNum);
		
	}

}