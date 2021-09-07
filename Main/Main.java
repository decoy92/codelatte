
public class Main {

	public static void main(String[] args) {
		
		int num1 = 25;
        int num2 = 10;

        System.out.println("num1 : "+ num1 + ", num2 : "+num2);

        // TODO : 더하기 연산
        int result1 = num1 + num2;
        System.out.println("num1 + num2 : "+result1);

        // TODO : 빼기 연산
        int result2 = num1 - num2;
        System.out.println("num1 - num2 : "+result2);

        // TODO : 곱하기 연산
        int result3 = num1 * num2;
        System.out.println("num1 * num2 : "+result3);

        // TODO : 나누기 연산
        int result4 = num1 / num2;
        System.out.println("num1 / num2 : "+result4);

        // TODO : 모드(나머지) 연산
        int result5 = num1 % num2;
        System.out.println("num1 % num2 : "+result5);

        // TODO : 곱하기 더하기 연산
        int result6 = num1 - num2 * 2;
        System.out.println("num1 - num2 * 2 : "+result6);

        // TODO : 곱하기 더하기 괄호 연산
        int result7 = (num1 - num2) * 2;
        System.out.println("(num1 - num2) * 2 : "+result7);

        // TODO : ++ 연산자 (후행 연산자)
        int value1 = 10;
        System.out.println("value1++ : "+value1++);
        // 변수에 저장된 값을 반환한다, 해당 변수에 값을 먼저 읽는다, 값을 1 더한다, 연산된 결과 값을 변수에 저장한다.
        int num = 100;
        System.out.println(num++);
        System.out.println(num);
        // 출력값 : 100, 101
        // 후행 연산자, 후행 연산자 구분해야함.

        
        
        
        int value2 = 10;
        System.out.println("++value2 : "+(++value2));

        // TODO : -- 연산자

        int value3 = 10;
        System.out.println("value3-- : "+value3--);

        int value4 = 10;
        System.out.println("--value4 : "+--value4);

        // TODO : < 연산자
        int tempIntNumber1 = 20;
        System.out.println("tempIntNumber1 : "+tempIntNumber1);
        boolean isBigger = 10 < tempIntNumber1;
        System.out.println("10 < tempIntNumber1 : "+isBigger);

        // TODO : > 연산자
        boolean isSmaller = 30 > tempIntNumber1;
        System.out.println("30 > tempIntNumber1 : "+isSmaller);

        // TODO : <= 연산자
        boolean isEqual1 = 20 <= tempIntNumber1;
        System.out.println("20 <= tempIntNumber1 : "+isEqual1);

        boolean isBigger2 = 10 <= tempIntNumber1;
        System.out.println("10 <= tempIntNumber1 : "+isBigger2);

        // TODO : >= 연산자
        boolean isEqual2 = 20 >= tempIntNumber1;
        System.out.println("20 >= tempIntNumber1 : "+isEqual2);

        boolean isSmaller2 = 30 >= tempIntNumber1;
        System.out.println("30 >= tempIntNumber1 : "+isSmaller2);

        // TODO : == 연산자(같다)
        boolean isEqual3 = 20 == tempIntNumber1;
        System.out.println("20 == tempIntNumber1 : "+isEqual3);

        // TODO : != 연산자(같다)
        boolean isNotEqual = 25 != tempIntNumber1;
        System.out.println("25 != tempIntNumber1 : "+isNotEqual);

        // TODO : ! 연산자(Not, 부정)
        boolean isTrue = !(10 < tempIntNumber1);
        System.out.println("!(10 < tempIntNumber1) : "+isTrue);

        // TODO : && 연산자(And, 그리고)
        boolean isTrue2 = (10 < 100) && (10 < 1);
        System.out.println("(10 < 100) && (10 < 1) : "+isTrue2);

        // TODO : || 연산자(Or, 또는)
        boolean isTrue3 = (10 < 100) || (10 < 1);
        System.out.println("(10 < 100) || (10 < 1) : "+isTrue3);

        // TODO : ^ 연산자(XOR, 또는)
        boolean isTrue4 = (10 < 100) ^ (10 < 1);
        System.out.println("(10 < 100) ^ (10 < 1) : "+isTrue4);

	}

}
