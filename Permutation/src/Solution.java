import java.util.ArrayList;
//import java.util.Collections;

/**
 * 求字符串的全排列
 * @author xiaoqing
 *
 */
public class Solution {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<String>();
		if(str==null||str.length()==1)  {
			list.add(str);
			return list;
		}
		char[] array = str.toCharArray();
		Permutation(array,0,str.length(),list);
		//Collections.sort(list); 
		return list;
		
    }
	
	void Permutation(char[] array,int begin,int length, ArrayList<String> list) {
		if(length==1) {
			list.add(new String(array));
			return;
		}
		int end = begin + length-1;
		for(int i=begin;i<=end;i++) {
			//if(!(i!=begin&&array[begin]==array[i])) {
			char temp = array[begin];
			array[begin] = array[i];
			array[i] = temp;
			Permutation(array,begin+1,length-1,list);
			temp = array[begin];
			array[begin] = array[i];
			array[i] = temp;
		//	}
		}
		
		
		
		
	}
	public static void main(String[] args) {
		Solution solution = new Solution();
		ArrayList<String> list = solution.Permutation("abc");
		for(String str:list) {
			System.out.println(str);
		}

	}

}
