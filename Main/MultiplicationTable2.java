// 2�ܺ��� 9�ܱ��� ����ϴ� ������ ������ �ۼ� (���� �ݺ� ����)
public class MultiplicationTable2 {

	public static void main(String[] args) {
		
		int bigSeqNum = 2;
		int seqNum = 0;
		while (9 >= bigSeqNum && 9 >= (seqNum++)) {
		    if (9 < seqNum) {
		        bigSeqNum++;
		        seqNum = 0;
		    } else {
		        System.out.println(String.format("%d x %d = %d", bigSeqNum, seqNum, bigSeqNum * seqNum));
		    }
		}

	}
}