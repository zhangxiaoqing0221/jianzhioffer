import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	  public String PrintMinNumber(int [] numbers) {
		  String result = new String();
		  if(numbers.length==0||numbers==null) return result;
		  ArrayList<Integer> list = new ArrayList<Integer>();
		  for(int i=0;i<numbers.length;i++) {
			  list.add(numbers[i]);
		  }
		 Collections.sort(list,new NumberComparator());
		 StringBuilder sb = new StringBuilder();
		 for(Integer integer:list) {
			 sb.append(integer);
		 }
		  return sb.toString();

	   
	  }
	  
	  class NumberComparator implements Comparator {

		@Override
		public int compare(Object o1, Object o2) {
			String s1 = o1.toString()+o2.toString();
			String s2 = o2.toString() + o1.toString();
			return s1.compareTo(s2);
		}
		  
	  }
	  
	  public static void main(String[] args) {
			Solution solution = new Solution();
			int[] array = new int[] {3,32,321};
			System.out.println(solution.PrintMinNumber(array));
	
		}
	  
	  


}
