package forwhile;

public class For1 {
	public static void main(String[] args) {
		System.out.println("Start ...");
		int sum = 0;
		int count = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
			count++;
		}
		System.out.println((float)sum/count+", "+count);
	}
}
