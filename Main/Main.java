
public class Main {

	public static void main(String[] args) {
		
		int num1 = 25;
        int num2 = 10;

        System.out.println("num1 : "+ num1 + ", num2 : "+num2);

        // TODO : ���ϱ� ����
        int result1 = num1 + num2;
        System.out.println("num1 + num2 : "+result1);

        // TODO : ���� ����
        int result2 = num1 - num2;
        System.out.println("num1 - num2 : "+result2);

        // TODO : ���ϱ� ����
        int result3 = num1 * num2;
        System.out.println("num1 * num2 : "+result3);

        // TODO : ������ ����
        int result4 = num1 / num2;
        System.out.println("num1 / num2 : "+result4);

        // TODO : ���(������) ����
        int result5 = num1 % num2;
        System.out.println("num1 % num2 : "+result5);

        // TODO : ���ϱ� ���ϱ� ����
        int result6 = num1 - num2 * 2;
        System.out.println("num1 - num2 * 2 : "+result6);

        // TODO : ���ϱ� ���ϱ� ��ȣ ����
        int result7 = (num1 - num2) * 2;
        System.out.println("(num1 - num2) * 2 : "+result7);

        // TODO : ++ ������ (���� ������)
        int value1 = 10;
        System.out.println("value1++ : "+value1++);
        // ������ ����� ���� ��ȯ�Ѵ�, �ش� ������ ���� ���� �д´�, ���� 1 ���Ѵ�, ����� ��� ���� ������ �����Ѵ�.
        int num = 100;
        System.out.println(num++);
        System.out.println(num);
        // ��°� : 100, 101
        // ���� ������, ���� ������ �����ؾ���.

        
        
        
        int value2 = 10;
        System.out.println("++value2 : "+(++value2));

        // TODO : -- ������

        int value3 = 10;
        System.out.println("value3-- : "+value3--);

        int value4 = 10;
        System.out.println("--value4 : "+--value4);

        // TODO : < ������
        int tempIntNumber1 = 20;
        System.out.println("tempIntNumber1 : "+tempIntNumber1);
        boolean isBigger = 10 < tempIntNumber1;
        System.out.println("10 < tempIntNumber1 : "+isBigger);

        // TODO : > ������
        boolean isSmaller = 30 > tempIntNumber1;
        System.out.println("30 > tempIntNumber1 : "+isSmaller);

        // TODO : <= ������
        boolean isEqual1 = 20 <= tempIntNumber1;
        System.out.println("20 <= tempIntNumber1 : "+isEqual1);

        boolean isBigger2 = 10 <= tempIntNumber1;
        System.out.println("10 <= tempIntNumber1 : "+isBigger2);

        // TODO : >= ������
        boolean isEqual2 = 20 >= tempIntNumber1;
        System.out.println("20 >= tempIntNumber1 : "+isEqual2);

        boolean isSmaller2 = 30 >= tempIntNumber1;
        System.out.println("30 >= tempIntNumber1 : "+isSmaller2);

        // TODO : == ������(����)
        boolean isEqual3 = 20 == tempIntNumber1;
        System.out.println("20 == tempIntNumber1 : "+isEqual3);

        // TODO : != ������(����)
        boolean isNotEqual = 25 != tempIntNumber1;
        System.out.println("25 != tempIntNumber1 : "+isNotEqual);

        // TODO : ! ������(Not, ����)
        boolean isTrue = !(10 < tempIntNumber1);
        System.out.println("!(10 < tempIntNumber1) : "+isTrue);

        // TODO : && ������(And, �׸���)
        boolean isTrue2 = (10 < 100) && (10 < 1);
        System.out.println("(10 < 100) && (10 < 1) : "+isTrue2);

        // TODO : || ������(Or, �Ǵ�)
        boolean isTrue3 = (10 < 100) || (10 < 1);
        System.out.println("(10 < 100) || (10 < 1) : "+isTrue3);

        // TODO : ^ ������(XOR, �Ǵ�)
        boolean isTrue4 = (10 < 100) ^ (10 < 1);
        System.out.println("(10 < 100) ^ (10 < 1) : "+isTrue4);

	}

}
