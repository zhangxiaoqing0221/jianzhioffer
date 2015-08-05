
public class Solution {
	  public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	        if(array.length<2||array==null) return;//注意检测输入条件
	        int result = 0;
	        for(int i=0;i<array.length;i++) {
	        	result ^= array[i];
	        }
	        int index = FindFirstBit(result);
	        for(int i=0;i<array.length;i++) {
	        	if(IsBit(array[i],index)) {
	        		num1[0] ^= array[i];
	        	}else {
	        		num2[0] ^= array[i];
	        	}
	        }
	    }
	  
	  int FindFirstBit(int number) {
		  int index = 0;
		  while((number&1)==0 && (index<32)) {
			  number = number >> 1;
		  	  ++index;
		   }
		  return index;
	  }
	  boolean IsBit(int number,int index) {
		  number = number >> index;
	        if((number&1)==0) return false;
	        return true;		  
	  }

	public static void main(String[] args) {
		Solution soultion = new Solution();
		int[] array = new int[] {2,4,3,6,3,2,5,5};
		int num1 = 0,num2 = 0;
		soultion.FindNumsAppearOnce(array,new int[]{num1},new int[]{num2});
		///System.out.println(num1+" "+num2);
	}

}
