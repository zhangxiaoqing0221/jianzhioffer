
public class Solution {
	
	public int minNumberInRotateArray(int [] array) {
		if(array.length==0||array==null) return 0;
		int index1 = 0;
		int index2 = array.length-1;
		int indexMid = 0;
		while(array[index1]>=array[index2]) {
			if(index2-index1==1) {
				indexMid= index2;
				break;
			}
			indexMid = (index1+index2)/2;
			if(array[index1]==array[indexMid]&&array[indexMid]==array[index2]) 
				return MinOrder(array,index1,index2);
			if(array[indexMid]>=array[index1]) index1 = indexMid;
			else if(array[indexMid]<=array[index2]) index2 = indexMid;
		}
	return array[indexMid];
	    
    }
	
	public int MinOrder(int[] array,int index1,int index2) {
		int min = array[index1];
		for(int i = index1+1;i<=index2;i++) {
			if(min>array[i]) min = array[i];
		}
		return min;
	}

	public static void main(String[] args) {
	Solution solution = new Solution();
	int[] array = new int[]{3,4,5,1,2};
	System.out.println(solution.minNumberInRotateArray(array));

	}

}
