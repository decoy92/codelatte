// 1���� 10������ �ڿ��� �߿��� ¦���� ���Ϸ���? (even number : ¦�� / odd number : Ȧ��)
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