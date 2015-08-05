import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	     //需要对输入条件做判断
	       if(sum<3) return list;
	        int small = 1;
	        int big = 2;
	        int middle = (1+sum)/2;//注意middle的取值
	        int curSum = small+big;
	        while(small<middle) {
	        	//curSum==sum
	        	if(curSum==sum) {
	        		//将值添加
	        		ArrayList<Integer> array = new ArrayList<Integer>();
	        		for(int i=small;i<=big;i++) {
	        			array.add(i);
	        		}
	        		list.add(array);
	        	}
	        	//curSum>sum
	        	while(curSum>sum && small<middle) {
	        		curSum -=small;
	        		small++;
	        		if(curSum==sum) {
		        		//将值添加
		        		ArrayList<Integer> array = new ArrayList<Integer>();
		        		for(int i=small;i<=big;i++) {
		        			array.add(i);
		        		}
		        		list.add(array);
		        	}
	        	}
	        	
	        	////curSum<sum
	        	big++;
	        	curSum +=big;
	        	
	        }
	        return list;
	        
	       
    }

	public static void main(String[] args) {
		Solution soultion = new Solution();
		ArrayList<ArrayList<Integer>> list = soultion.FindContinuousSequence(3);
		for(int i =0;i<list.size();i++) {
			ArrayList<Integer> array = list.get(i);
			for(Integer integer:array) {
				System.out.print(integer+" ");
			}
			System.out.println();
		}

	}

}
