// 2단부터 9단까지 출력하는 구구단 순서도 작성 (이중 반복 구조)
public class MultiplicationTable1 {

	public static void main(String[] args) {
		
		int bigSeqNum = 2;
		int seqNum = 1;
		while (true) {
		    if (9 == bigSeqNum && 9 < seqNum) {
		        break; // 9~10번째 줄 :만약 bigSeqNum 변수가 9와 같고(&& = AND) seqNum 변수가 9보다 클 때 break;
		    } else if (9 < seqNum) {
		        bigSeqNum++;
		        seqNum = 1; // 11~13번째 줄 : 그렇지 않으면(seqNum 변수가 9보다 크지 않으면) 1씩 증가...?
		    }
		    System.out.println(String.format("%d x %d = %d", bigSeqNum, seqNum, bigSeqNum * seqNum));
		    seqNum++;
		}

	}
}
