package programmers.Lv2;

public class L2Solve12939 {
	//최댓값과 최솟값
	public static void main(String[] args) {
		String s = "1 2 3 4";
//		String s = "-1 -2 -3 -4";
//		String s = "-1 -1";
		
		String answer = "";
		
		//스트링 배열에 s를 공백 기준으로 찢어 넣는다
        String[] arr = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        //배열안 원소들을 돌리면서 최댓값과 최솟값을 구한다
        for(String s1 : arr) {
            max = Math.max(max, Integer.parseInt(s1));
            min = Math.min(min, Integer.parseInt(s1));
        }
        
        //구한 최솟값과 최댓값을 리턴할 문자열에 순서대로 넣는다.
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        System.out.println(answer);
	}

}
