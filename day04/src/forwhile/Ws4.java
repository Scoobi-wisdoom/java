package forwhile;

import java.util.Scanner;

public class Ws4 {
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("���α׷��� �����մϴ�. ������ ���� �� �ϳ��� �Է����ּ���.");
			System.out.println("A, D, U, R, Q");
			Scanner sc = new Scanner(System.in);
			String input = "";
			input = sc.nextLine();
			
			if (input.equalsIgnoreCase("Q")) {
				sc.close();
				break;
			}
			
			if (input.equalsIgnoreCase("A")) {
				System.out.println("���� �̸��� �Է��Ͻÿ�.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("ADD COMPLETE");
				System.out.println("���� �޴��� ������ Q�� �����ÿ�.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
			
			if (input.equalsIgnoreCase("D")) {
				System.out.println("������ ���� �̸��� �Է��Ͻÿ�.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("Delete COMPLETE");
				System.out.println("���� �޴��� ������ Q�� �����ÿ�.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
			
			if (input.equalsIgnoreCase("U")) {
				System.out.println("������Ʈ�� ���� �̸��� �Է��Ͻÿ�.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("Update COMPLETE");
				System.out.println("���� �޴��� ������ Q�� �����ÿ�.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
			
			if (input.equalsIgnoreCase("R")) {
				System.out.println("������ ���� �̸��� �Է��Ͻÿ�.");
				String en_name = "";
				en_name = sc.nextLine();
				System.out.println("Retrieve COMPLETE");
				System.out.println("���� �޴��� ������ Q�� �����ÿ�.");
				input = sc.nextLine();
				
				if (input.equalsIgnoreCase("Q")) {
					continue;
				}
			}
		}
		System.out.println("���α׷��� �����մϴ�.");
			
	}

}