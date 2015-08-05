
public class Solution {
//	 public int GetNumberOfK(int [] array , int k) {
//		 if(array.length==0||array==null) return 0;
//		 int first = GetFirstK(array,k,0,array.length-1);
//		 int last  = GetLastK(array,k,0,array.length-1);
//		 return last-first+1;	       
//	    }
//	 
//	 int GetFirstK(int[]array,int k,int start,int end) {
//		 int mid = (start+end)/2;
//		 int midNumber = array[mid];
//		 if(midNumber == k) {
//			 if(mid>0&&array[mid-1]!=k || mid==0) return mid;
//			 else end = mid-1;
//		 }else if(midNumber<k) {
//			 start = mid+1;
//		 }else {
//			 end = mid-1;
//		 }
//		 return GetFirstK(array,k,start,end);
//		 
//	 }
//	 int GetLastK(int[]array,int k,int start,int end) {
//		 int mid = (start+end)/2;
//		 int midNumber = array[mid];
//		 if(midNumber == k) {
//			 if(mid<array.length-1&&array[mid+1]!=k || mid==array.length-1) return mid;
//			 else start = mid+1;
//		 }else if(midNumber<k) {
//			 start = mid+1;
//		 }else {
//			 end = mid-1;
//		 }
//		 return GetLastK(array,k,start,end);
//		 
//	 }
	 public int GetNumberOfK(int [] array , int k) {
		 if(array.length==0||array==null) return 0;
		 int count = 0;
		 for(int i=0;i<array.length;i++) {
			 if(array[i]==k) count++;
			 else if(array[i]>k) break;
		 }
		 return count; 
	    }
	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] array = new int[]{1,2,3,3,3,3,4,5};
		System.out.println(solution.GetNumberOfK(array, 5));

	}

}
