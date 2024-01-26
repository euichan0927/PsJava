package Week1;

public class MulString {
	class Solution {
		public String solution(String my_string, int k) {
			String answer =my_string;
			for (int i = 1; i <k ; i++) {
				answer+=my_string;
			}
			return answer;
		}

	}
}
