package programmers;

import java.util.HashMap;
import java.util.Map;

public class Solve1845 {
	//폰켓몬
	public static void main(String[] args) {
		
		int[] nums = new int[] {3,1,2,3};
//		int[] nums = new int[] {3,3,3,2,2,4};
//		int[] nums = new int[] {3,3,3,2,2,2};
		
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();

		//key에 nums의 요소들을 넣어준다. 
		for (int i = 0; i < nums.length; i++) {   
			map.put(nums[i], i);
		}
		
		if (map.size() == nums.length / 2) {
			answer = nums.length / 2;
		} else if (map.size() > nums.length / 2) {
			answer = nums.length / 2;
		} else {
			answer = map.size();
		}
		
		System.out.println(answer);
	}
}
