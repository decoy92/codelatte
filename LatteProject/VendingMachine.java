import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		final String[] beverageNames = {"��������Ʈ", "�ݶ�", "��Ű��"};
        final int[] beverageCost = {1100, 900, 1400};
        final int[] beverageStock = {4, 3, 2};
        int money = 0;
        int selectedBeverage = -1;
        int isExit = 0;

        do {
            for (int index = 0; index < 3; index++) {
                System.out.printf("%d.%s (%s��)\n",
                        index, beverageNames[index], beverageCost[index]);
            }
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("���� ������ �ּ���.");
                money = money + scanner.nextInt();

                do {
                    System.out.println("���Ḧ �������ּ���.");
                    selectedBeverage = scanner.nextInt();
                    if (beverageStock[selectedBeverage] <= 0) {
                        System.out.printf("%s ���ᰡ �������� �ʽ��ϴ�. �ٸ� ���Ḧ �������ּ���.\n",
                                beverageNames[selectedBeverage]);
                    }
                } while (beverageStock[selectedBeverage] <= 0);

                if (beverageCost[selectedBeverage] > money) {
                    System.out.println("�ݾ��� �����մϴ�.");
                }

            } while (beverageCost[selectedBeverage] > money);

            money = money - beverageCost[selectedBeverage];
            beverageStock[selectedBeverage] = beverageStock[selectedBeverage] - 1;

            System.out.printf("%s ���Ḧ �����߽��ϴ�.\n", beverageNames[selectedBeverage]);

            System.out.printf("���� �ݾ��� %d�� �Դϴ�.\n", money);

            System.out.println("�Ž��� ���� ��ȯ �����ðڽ��ϱ�?(yes�� 1/ no�� 0)");
            Scanner scanner = new Scanner(System.in);
            isExit = scanner.nextInt();

        } while (isExit == 0);
    }
}

