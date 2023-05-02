package programmers.Lv1;

import java.util.Arrays;
import java.util.Stack;

public class L1Solve12906 {
	// 같은 숫자는 싫어
	public static void main(String[] args) {
		
		int []arr = new int[] {1,1,3,3,0,1,1};
		Stack<Integer> stack = new Stack<>();
	       
		stack.push(arr[0]);
		for(int i=1; i<arr.length; i++) {
			stack.push(arr[i]);
			if(arr[i-1] == arr[i]) {
				stack.pop();
			}
		}
        int[] answer = new int[stack.size()];
       for(int i=stack.size()-1; i>=0; i--) {
			answer[i] = stack.pop();
		}
       System.out.println(Arrays.toString(answer));
	}

}
