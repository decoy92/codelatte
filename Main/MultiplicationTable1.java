// 2�ܺ��� 9�ܱ��� ����ϴ� ������ ������ �ۼ� (���� �ݺ� ����)
public class MultiplicationTable1 {

	public static void main(String[] args) {
		
		int bigSeqNum = 2;
		int seqNum = 1;
		while (true) {
		    if (9 == bigSeqNum && 9 < seqNum) {
		        break; // 9~10��° �� :���� bigSeqNum ������ 9�� ����(&& = AND) seqNum ������ 9���� Ŭ �� break;
		    } else if (9 < seqNum) {
		        bigSeqNum++;
		        seqNum = 1; // 11~13��° �� : �׷��� ������(seqNum ������ 9���� ũ�� ������) 1�� ����...?
		    }
		    System.out.println(String.format("%d x %d = %d", bigSeqNum, seqNum, bigSeqNum * seqNum));
		    seqNum++;
		}

	}
}
