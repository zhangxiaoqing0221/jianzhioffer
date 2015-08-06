
public class Solution {
	 // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
    	int[] array = new int[length];
    	for(int i=0;i<length;i++) {
    		if(array[numbers[i]]==0) array[numbers[i]]++;
    		else if(array[numbers[i]]==1) {
    			duplication[0] = numbers[i];
    			return true;
    		}   		
    	}
    	
    	return false;
    
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] numbers = new int[] {2,3,1,0,2,5,3};
		int dup = 0;
		System.out.println(solution.duplicate(numbers, numbers.length, new int[]{dup}));

	}

}
