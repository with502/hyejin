package programmers;

public class L1Solve12954 {
	// x만큼 간격이 있는 n개의 숫자
	public static void main(String[] args) {
		//test1
		int x = 2;
		int n = 5;
		
		//test2
//		int n = 4;
//		int x = 3;
		//test3
//		int n = -4;
//		int x = 23;
		
		long[] answer = new long[n];

		for (int i = 0, j = x; i < n; i++, j += x) {
			answer[i] = j;
		}
		System.out.println(answer);
	}
}
