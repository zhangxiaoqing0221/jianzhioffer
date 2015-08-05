
public class Solution {
	 public int FindGreatestSumOfSubArray(int[] array) {
		 if(array.length==0||array == null) return 0;
		 int number = 0;
		 int  greatNumber = Integer.MIN_VALUE;
		 for(int i=0;i<array.length;i++) {
			 if(number <=0) number = array[i];
			 else number = number+array[i];
			 if(number>greatNumber) greatNumber = number;
		 }
		 return greatNumber;
	  }

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = new int[] {6,-3,-2,7,-15,1,2,2};
		System.out.println(solution.FindGreatestSumOfSubArray(array));
		

	}

}
