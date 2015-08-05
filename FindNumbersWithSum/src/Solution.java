import java.util.ArrayList;

public class Solution {
public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	ArrayList<Integer>  list = new ArrayList<Integer> ();
	if(array.length==0||array==null) return list;
	int index1 = 0, index2 = array.length-1;
	while(index1<index2) {
		 long curSum = array[index1]+array[index2];
		if(curSum == sum) {
			list.add( array[index1]);
			list.add( array[index2]);
			break;
		}			
		else if(curSum>sum) {
			index2--;
		}else {
			index1++;
		}
		
	}
	return list;
        
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] array = new int[]{1,2,4,7,11,15};
		ArrayList<Integer> list = solution.FindNumbersWithSum(array, 15);
		for(Integer integer:list) {
			System.out.println(integer);
		}
		

	}

}
