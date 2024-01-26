package Week1;

public class CompareNumber {
	class Solution {
		public int solution(int a, int b) {
			String answer = String.valueOf(a) + String.valueOf(b);
			int result = Integer.parseInt(answer);
			int mul = 2*a*b;
			if(result>= mul){
				return result;
			}
			else{
				return mul;
			}
		}
	}
}
