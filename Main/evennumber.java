// 1부터 10까지의 자연수 중에서 짝수를 구하려면? (even number : 짝수 / odd number : 홀수)
public class evennumber {

	public static void main(String[] args) {
		
		int number = 1;
		
		do {
			if (0 == number % 2) {
				System.out.println(number);
			}
			number = number + 1;
			
		} while (number <= 10);
	}

}