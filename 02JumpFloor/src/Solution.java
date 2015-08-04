
public class Solution {
	 public int JumpFloorII(int target) {
	        if(target==1||target==2) return target;
	         int number = 2;
	         int result = 0;
	         for(int i= 2;i<target;i++) {
	             result = 2*number;
	             number = result;
	         }
	         return result;
	    }
	 public static void main(String[] args) {
			Solution solution = new Solution();
			System.out.println(solution.JumpFloorII(5));

		}

}
