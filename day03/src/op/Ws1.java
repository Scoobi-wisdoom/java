package op;

import java.util.Scanner;

public class Ws1 {

	public static void main(String[] args) {
		// Scanner �� ���� �� ���� �Է� �޴´�.
		System.out.println("Type a number");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Type another number");
		String b = sc.nextLine();
		
		// ���� ������ �����Ͽ� ���� ���Ѵ�.
		int result = Integer.parseInt(a) + Integer.parseInt(b);
		sc.close();
		
		// ���� ���� 10 ���� ���ų� ������ "SMALL" 
		// 10���� ũ�� "BIG"�̶�� ����Ѵ�.
		String str = "";
		str = (result <= 10) ? "SMALL" : "BIG";
		System.out.println(str);
	}

}