package groupwork;

import java.util.Scanner;
import java.util.Arrays;

public class Lotto {

	public static void main(String args[]) {
		boolean bool = true;
		while (bool) {
			System.out.println("[1, 45] ������ ���ڸ� �ߺ� ���� �Է��Ͻÿ�.");

			// �ߺ� ���� ���� 6���� �Է¹޴´�.
			// 6���� ���ڷ� �̷���� �迭�� �����Ѵ�.
			int[] user = new int[6];
			Scanner sc = new Scanner(System.in);

			lotto: for (int i = 0; i < 6; i++) {
				System.out.printf("%d�� ° ���ڸ� �Է��Ͻÿ�. %n", i + 1);

				// ���� ����ڷκ��� String���� �Է¹޴´�.
				// ������ �Է����� ��� �ٽ� �Է��� �޴´�.
				String user_input = sc.nextLine();
				if (user_input.length() == 0) {
					i--;
					continue lotto;
				}

				// �Է¹��� ���� ���ڰ� �´��� üũ�Ѵ�.
				// String�� char array�� ��ȯ�Ͽ� üũ�Ѵ�.
				char[] check = user_input.toCharArray();
				for (int j = 0; j < check.length; j++) {
					if (check[j] < '0' || check[j] > '9') {
						System.out.println(check[j]);
						System.out.println("���ǿ� �°� �Է����ּ���.");
						i--;
						continue lotto;
					}
				}

				// �Է¹��� String�� int�� ��ȯ�Ѵ�.
				int input_num = 0;
				input_num = Integer.parseInt(user_input);

				// �Է¹��� ���ڰ� [1, 45] ������ ���ϴ��� üũ�Ѵ�.
				if (input_num < 1 || input_num > 45) {
					System.out.println("������ �´� ���ڰ� �ƴմϴ�.");
					i--;
					continue lotto;
				}

				// �Է¹��� ���� �߿� �ߺ��� ���� �ִ��� �˻��Ѵ�.
				if (i > 0) {
					for (int j = 0; j < i; j++) {
						if (input_num == user[j]) {
							i--;
							continue lotto;
						}
					}
				}

				// �Է¹��� ���ڸ� user�� �����Ѵ�.
				user[i] = input_num;

				// i == 5 �� �Ǵ� 6�� ° ���࿡�� ������ ����Ѵ�.
				// ������� ���ÿ� ���� �ٽ� ��������, �׸����� �����Ѵ�.
				if (i == 5) {
					System.out.println();
					System.out.println(Arrays.toString(user));

					while (true) {
						System.out.println("�Է��Ͻ� ���ڰ� �½��ϱ�? (Y/N)");

						user_input = sc.nextLine();
						if (user_input.equalsIgnoreCase("N")) {
							i = 0;
							i--;
							continue lotto;
						} else if (user_input.equalsIgnoreCase("Y")) {
							break;
						} else {
							// Y, y, N, n �ܿ� �ٸ� ���� �Է����� ��� �ٽ� �Է��϶�� ���´�.
							System.out.println("�߸� �Է��߽��ϴ�.");
						}
					}

					// ����Ȯ���� ������, ���� �޴��� ���ư� ������ üũ�Ѵ�.
					while (true) {
						System.out.println("���Ÿ� Ȯ���Ͻ÷��� Y ��, ���� �޴��� ���ư��� ������ N �� �����ּ���.");
						user_input = sc.nextLine();
						if (user_input.equalsIgnoreCase("N")) {
							bool = false;
							break;
						} else if (user_input.equalsIgnoreCase("Y")) {
							break;
							// �ƹ� �͵� �� ��.
						} else {
							// Y, y, N, n �ܿ� �ٸ� ���� �Է����� ��� �ٽ� �Է��϶�� ���´�.
							System.out.println("�߸� �Է��߽��ϴ�.");
						}
					}

				} // if i == 5
				

			} // for lotto
			
			

			
		} // ��ü  while ����
		
		sc.close();
	}
	
}