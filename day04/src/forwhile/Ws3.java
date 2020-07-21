package forwhile;

import java.util.Random;
import java.util.Scanner;

public class Ws3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int count = 0;

		// [1, 100] ������ ������ �������� �����Ѵ�.
		int target_number = r.nextInt(100) + 1;
		System.out.println(target_number);
		
		
		while (true) {
			
			System.out.println("[1, 100] ������ ������ �Է��Ͻÿ�.");
			String input = "";
			int input_number = 0;
			
			// �Է��� �޴´�.
			input = sc.nextLine();
			
			// �Է¹��� String�� ���ڰ� ���ԵǾ����� �˻��Ѵ�. ���ڰ� ������ �ٽ� while�� �����Ѵ�.
			if (input.charAt(0) < '0' || input.charAt(0) > '9') {
				System.out.println("���ڸ� �Է��Ͻÿ�.");
				continue;
			}
			
			// �Է¹��� String�� int�� ��ȯ�Ѵ�. 
			// [1, 100] ������ ������ ���� ���̸�, �ٽ� while�� �����Ѵ�.
			input_number = Integer.parseInt(input);
			if (input_number > 100 || input_number < 1) {
				continue;
			}
			
			// �Է� ���� int�� �������� ������ ���� �������� �˻��Ѵ�.
			// �����ϸ� "����"�� ����Ѵ�.
			// �������� ������ "������ ����Ѵ�. �ٽ� while�� �����Ѵ�.
			if (input_number == target_number) {
				System.out.println("����");
				
			// ������ ���� Ƚ���� ����Ѵ�.
				count++;
				
				System.out.println();
				System.out.println("������ �ٽ� �ϰ� ������ '�ٽ� ����'�� �Է��Ͻÿ�.");
				String retry = "";
				retry = sc.nextLine();
			
			// "�ٽ� ����"�� ���� ��� �������� ���� �ٽ� ������ �Ŀ� �ٽ� while�� �����Ѵ�.
				if (retry.equals("�ٽ� ����")) {
					target_number = r.nextInt(100) + 1;
					System.out.println(target_number);
					continue;
				}
				break;
			} else {
				System.out.println("����");
			}
			
		}
		System.out.println("������ �����մϴ�. ���� Ƚ��: "+count);
		sc.close();
	}
	

}

