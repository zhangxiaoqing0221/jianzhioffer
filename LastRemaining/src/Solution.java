
public class Solution {
	 public int LastRemaining_Solution(int n, int m) {
		 if(n<1 || m<1) return -1;
		 int result = 0;
		 for(int i=2;i<=n;i++) {
			 result = (result+m)%i;
		 }
		 return result;
	        
	    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.LastRemaining_Solution(5, 2));

	}

}
