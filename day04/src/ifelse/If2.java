package ifelse;

import java.util.Random;

public class If2 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(20) + 1;
		String msg = "";
		if (num <= 5) {
			msg = "Small Number";
		}else if ( num <= 10) {
			msg = "Medium Number";
		}else if (num <= 20) {
			msg = "Big Number";
		}else {
			System.out.println("Abnormal Number ...");
			return;
		}
		
		System.out.println("Program Start ...");
		System.out.println("Result: "+msg);
		System.out.println("Program End ...");
	}

}
