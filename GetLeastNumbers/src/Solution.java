import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Solution {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(input.length<k || k<=0)   return result; //检测输入条件
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(int i=0;i<input.length;i++) {
			if(i<k) treeSet.add(input[i]);
			else {
				Integer number = treeSet.last(); //获取最大元素（最大堆）
				if(input[i]<number) {
					treeSet.pollLast();
					treeSet.add(input[i]);					
				}
			}
		}
		Iterator<Integer> iterator = treeSet.iterator();
		while(iterator.hasNext())  {
			result.add(iterator.next());
		}
		return result;	     
    }
	
	public static void main(String[] args) {
	Solution solution = new Solution();
	int[] array = new int[] {4,5,1,6,2,7,3,8};
	 ArrayList<Integer> list = solution.GetLeastNumbers_Solution(array, 4);
	 for(Integer integer:list) {
		 System.out.println(integer);
	 }
	

}

}
