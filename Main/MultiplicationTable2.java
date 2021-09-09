// 2단부터 9단까지 출력하는 구구단 순서도 작성 (이중 반복 구조)
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