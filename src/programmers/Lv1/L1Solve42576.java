package programmers.Lv1;

import java.util.HashMap;
import java.util.Map;

public class L1Solve42576 {
	//완주하지 못한 선수
	// 아직 못품
	public static void main(String[] args) {
		String[] participant  = new String[] {"leo", "kiki", "eden"};
		String[] completion = new String[] {"eden", "kiki"};
		
		String answer = "";
        int same = 0;
        Map<Integer, String> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++) {
            map.put(i, participant[i]);
        }
        for(int i=0; i< completion.length; i++) {
            for(int j=0; j<map.size(); j++) {
                if(completion[i].equals(map.get(j))) {
                    map.remove(j);
                }
            }
        }
        
	}
}
