package op;

public class Ws4 {

	public static void main(String[] args) {
		// 랜덤하게 1~ 100점을 4개의 변수에 생성 한다.
		int num1 = (int)(Math.random() * 100) + 1;
		int num2 = (int)(Math.random() * 100) + 1;
		int num3 = (int)(Math.random() * 100) + 1;
		int num4 = (int)(Math.random() * 100) + 1;
		
		// 평균을 구한다.
		double mean = (double)(num1 + num2 + num3 + num4) / 4;
		// 평균을 소숫점 2자리에서 올림한다.
		double result = Math.ceil(mean*10) / 10;
		
		// grade를 평균 점수에 따라 산출한다.
		// 평균이 90점 이상이면 A와 평균 출력
		// 평균이 80점 이상이면 B와 평균 출력
		// 평균이 70점 이상이면 C와 평균 출력
		// 평균이 60점 이상이면 D와 평균 출력
		// 미만이면 F 와 평균 출력
		char grade = 0;
		grade = (mean >= 90) ? 'A' : 
				((mean >= 80) ? 'B' :
				((mean >= 70) ? 'C' :
				((mean >= 60) ? 'D' : 'F')));
		
		System.out.println("Grade: "+grade+", Mean: "+result);
		System.out.println("Original Mean: "+mean);
	}

}
