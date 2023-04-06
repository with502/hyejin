package programmers;

public class L2Solve12951 {
	// JadenCase 문자열 만들기    //보류
	public static void main(String[] args) {
//		String s = "3people unFollowed me";
		String s = "for the last week";

		String answer = "";
		// 앞 뒤로 공백이 있을 수 있으니까 앞 뒤 공백 자른다.
		String s1 = s.trim();
		// 공백 기준으로 찢어 단어로 배열에 넣는다.
		String[] arr1 = s1.split("\\s");
		//단어를 알파벳으로 다시 한번 찢어 배열에 넣는다
		//문장 -> 단어 -> 알파벳
		for (String s2 : arr1) {
			String[] str = s2.split("");
			if (str[0].matches("[0-9]")) {  //만약 단어의 첫글자가 숫자라면 다 소문자로 변환
				answer += s2.toLowerCase() + " ";
			} else { //그렇지 않으면 첫글자만 대문자로 변환하고
				answer += str[0].toUpperCase();
				for (int i = 1; i < s2.length(); i++) {  //단어의 1번인덱스부터 소문자로 변환
					answer += str[i].toLowerCase();
				}
				answer += " "; //단어를 문자열에 넣고 띄우고 반복
			}
		}
		//근데 안나옴...왜일까..
		System.out.println(answer);
	}
}
