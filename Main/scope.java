
public class scope {

	public static void main(String[] args) {
		
		// 내부범위에서는 외부범위에 접근이 가능하나, 외부범위에서는 내부범위에 접근이 불가능하다. (매직미러)
		
		// 1을 계속 출력하는 이유

		int i = 0;
		while (i < 20) {
		    int number = 1;
		    System.out.println(number);
		    i++;
		}

		
		// 

		
		

	}

}
