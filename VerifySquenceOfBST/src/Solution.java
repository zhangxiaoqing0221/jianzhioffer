
public class Solution {
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence==null||sequence.length<=0) return false;
		 else return verifyCore(sequence,0,sequence.length);
	    }
	 
	 public boolean verifyCore(int[] sequence,int start,int length) {
		if(length==0) return true;
		 int end = start + length -1;
		 int root = sequence[end];
		 int left = start;
		 for(;left<end;left++){
			 if(sequence[left]>root) break;
		 }
		 int right = left;
		 for(;right<end;right++){
			 if(sequence[right]<root) return false;
		 }
		 //判断左子树
		 boolean isLeft = true;
		 if(left>0)  isLeft = verifyCore(sequence,start,left-start);
		 //判断右子树
		 boolean isRight = true;
		 if(left<end)  isRight= verifyCore(sequence,left,end-left);
		 return isLeft&&isRight;
	 }
	

	public static void main(String[] args) {
		int [] sequence = new int[]{5,7,6,9,11,10,8};
		Solution solution = new Solution();
		System.out.println(solution.VerifySquenceOfBST(sequence));

	}

}
