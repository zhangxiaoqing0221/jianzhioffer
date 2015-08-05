
public class Solution {
	public int InversePairs(int [] array) {
		if(array.length==0||array==null) return 0;
		int[] copy = new int[array.length];
		for(int i=0;i<array.length;i++) {
			copy[i] = array[i];
		}
		return compute(array,copy,0,array.length-1);
        
    }
	int compute(int[] array,int[] copy,int start,int end) {
		if(start==end) {
			copy[start] = array[start];
			return 0;
		}
		int length = (end-start)/2;
		int left = compute(copy,array,start,start+length);//注意参数传递copy和array
		int right = compute(copy,array,start+length+1,end);//注意参数传递copy和array
		
		int i = start+length;
		int j = end;
		int indexCopy = end;
		int count = 0; 
		while(i>=start&&j>=start+length+1) {
			if(array[i]>array[j]) {
				copy[indexCopy--] = array[i--];
				count += j-(start+length);
			}else {
				copy[indexCopy--] = array[j--];
			}
		}
		
		for(;i>=start;i--) copy[indexCopy--] = array[i--];
		for(;j>=start+length+1;j--) copy[indexCopy--] = array[j--];
		return left+right+count;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] array = new int[]{7,5,6,4};
		System.out.println(solution.InversePairs(array));

	}

}
