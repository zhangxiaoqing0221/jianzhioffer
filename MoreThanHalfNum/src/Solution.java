import java.util.ArrayList;

public class Solution {

	public int MoreThanHalfNum_Solution(int [] array) {
		if(array.length==0||array==null) return 0; //检测输入条件
		int number = array[0];
		int times = 1;
		for(int i=1;i<array.length;i++) {
			if(times == 0) {
				number = array[i];
				times = 1;
			}else {
			if(number == array[i]) {
				times++;
			}else times--;
			
			}
		}
		
		if(!CheckMoreThanHalf(array,number)) return 0;//检测number值出现的次数是否大于数组长度的一半
		return number;
		
        
    }
	
	 public boolean CheckMoreThanHalf(int[] array,int number) {
		 int times = 0;
		 for(int i=0;i<array.length;i++) {
			 if(array[i]==number) times++;
		 }
		 if(times*2<=array.length) return false;
		 return true;
	 }
	
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = new int[] {1,2,3,2,2,2,5,4,2};
		System.out.println(solution.MoreThanHalfNum_Solution(array));

	}
	
	
	

}
