package guess;

public class Game {
	
	int number;
	int count;
	
	static int play;
	
	public Game() {
		
	}
	
	public int checkNum(String check) {
		int result = 0;

		if (check.charAt(0) < '0' || check.charAt(0) > '9') {
			// ������ �� result = -1
			result = -1;
			
		} else if (Integer.parseInt(check) < 1 || Integer.parseInt(check) > 100) {
			// ������ ���� �ʴ� ������ ��� result = -2;
			result = -2;
		} else {
			result = Integer.parseInt(check);
			count++;
		}

		
		return result;
	}

}