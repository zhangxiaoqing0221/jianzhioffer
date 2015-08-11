package isContinuous;

import java.util.Arrays;


public class Solution {
	public boolean isContinuous(int[] numbers) {
		 if(numbers.length<5||numbers==null)
	            return false;
		Arrays.sort(numbers);
		int numberOfZero = 0;
		int numberOfGap = 0;
		for (int i = 0; i < numbers.length && numbers[i] == 0; ++i) {
			numberOfZero++;
		}
		int small = numberOfZero;
		int big = small + 1;
		while (big < numbers.length) {
			if (numbers[big]== numbers[small])
				return false;
			numberOfGap += numbers[big] - numbers[small] - 1; 
			small = big;
			big++;
		}
		return numberOfGap > numberOfZero ? false : true;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.isContinuous(new int[] { 0,3,1,6,4}));

	}

}
