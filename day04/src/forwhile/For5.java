package forwhile;

public class For5 {
	public static void main(String[] args) {
//		out:
//		for (int i=0; i<5;i++) {
//			for (int j=0; j<5; j++) {
//				System.out.print("[i], [j] "+i+", "+j+" | ");
//								
//			}
//			System.out.println();
//		}
	
		int i = 0;
		while (i < 5) {
			int j = 0;
			while (j < 5) {
				System.out.print("[i], [j] "+i+", "+j+" | ");
				j++;
			}
			System.out.println();
			i++;
			
		}
	}
}
