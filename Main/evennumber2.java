// 1���� 10������ �ڿ��� �߿��� ¦���� ���Ϸ���? (even number : ¦�� / odd number : Ȧ��)
public class evennumber2 {

	public static void main(String[] args) {
		
		int number = 1;
		
		if (0 == number % 2) {			
			System.out.println(number);
		} else {
			number = number + 1;
		}
		while (number <= 10);
	}

}