package ifelse;

import java.util.Random;

public class If4 {

	public static void main(String[] args) {
		Random r = new Random();
		int ko = r.nextInt(100) +1;
		int en = r.nextInt(100) +1;
		int ma = r.nextInt(100) +1;
		int si = r.nextInt(100) +1;
		System.out.printf("%d, %d, %d, %d %n", ko, en, ma, si);
		// ����� ���Ѵ�.
		double mean = (double)0;
		mean = (double)(ko + en + ma + si) / 4;
		String grade = "";

		// 90�̻�: 95�̻� A+, �̸��̸� A-
		// 80�̻�: 85�̻� B+, �̸��̸� B-
		// 70�̻�: 75�̻� C+, �̸��̸� C-
		// 60�̻�: 65�̻� D+, �̸��̸� D-
		// 60�̸� F
		
		if (mean >= 90) {
//			if (mean >= 95) {
//				grade = "A+";
//			} else {
//				grade = "A-";
//			}
			grade = (mean >= 95) ? "A+" : "A-";
		} else if (mean >= 80) {
//			if (mean >= 85) {
//				grade = "B+";
//			} else {
//				grade = "B-";
//			}
			grade = (mean >= 85) ? "B+" : "B-";
		} else if (mean >= 70) {
//			if (mean >= 75) {
//				grade = "C+";
//			} else {
//				grade = "C-";
//			}
			grade = (mean >= 70) ? "C+" : "C-";
		} else if (mean >= 60) {
//			if (mean >= 65) {
//				grade = "D+";
//			} else {
//				grade = "D-";
//			}
			grade = (mean >= 60) ? "D+" : "D-";
		} else {
			grade = "F";
		}
		
		
		// ��հ� ������ ����Ͻÿ�.
		System.out.printf("���: %.2f, ����: %s %n", mean, grade);
	}

}