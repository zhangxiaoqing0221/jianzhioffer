
public class Solution {
	
	public int JumpFloor(int target) {
	      if(target==1||target==2) return target;
	        int numberOne = 1;
	        int numberTwo = 2;
	        int result = 0;
	        for(int i=2;i<target;i++) {
	            result = numberOne + numberTwo;
	            numberOne = numberTwo;
	            numberTwo = result;
	        }
	        return result;
	    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.JumpFloor(5));

	}

}
