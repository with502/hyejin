package programmers.Lv1;

public class L1Solve12928 {
	//약수의 합
	public static void main(String[] args) {
		int n = 12;
//		int n = 5;
		
		int answer = 0;
		
        for(int i=1; i<=n; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
	}

}
