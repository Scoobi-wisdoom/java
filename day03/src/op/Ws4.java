package op;

public class Ws4 {

	public static void main(String[] args) {
		// �����ϰ� 1~ 100���� 4���� ������ ���� �Ѵ�.
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		int num3 = (int)(Math.random() * 100) + 1;
		int num4 = (int)(Math.random() * 100) + 1;
		
		// ����� ���Ѵ�.
		double mean = (double)(num1 + num2 + num3 + num4) / 4;
		// ����� �Ҽ��� 2�ڸ����� �ø��Ѵ�.
		double result = Math.ceil(mean*10) / 10;
		
		// grade�� ��� ������ ���� �����Ѵ�.
		// ����� 90�� �̻��̸� A�� ��� ���
		// ����� 80�� �̻��̸� B�� ��� ���
		// ����� 70�� �̻��̸� C�� ��� ���
		// ����� 60�� �̻��̸� D�� ��� ���
		// �̸��̸� F �� ��� ���
		char grade = 0;
		grade = (mean >= 90) ? 'A' : 
				((mean >= 80) ? 'B' :
				((mean >= 70) ? 'C' :
				((mean >= 60) ? 'D' : 'F')));
		
		System.out.println("Grade: "+grade+", Mean: "+result);
		System.out.println("Original Mean: "+mean);
	}

}