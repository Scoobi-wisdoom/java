package forwhile;

public class For3 {
	public static void main(String[] args) {
		System.out.println("Start ...");
		int sum = 0;
		int count = 0;
		// ¦���� �հ� ����� ���Ͻÿ�.
//		for(int i=2; i<=10; i+=2) {
//			sum += i;
//			count++;
//		}
		// ¦���� �հ� ����� ���Ͻÿ�.
		// i���� 80�̸� �׸��Ͻÿ�.
		for(int i=1; i<=100; i++) {
			if (i == 80) {
				break;
			}
			if (i%2 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println(sum);
		System.out.println((float)sum/count+", "+count);
	}
}