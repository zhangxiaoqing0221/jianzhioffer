import java.util.Stack;

/**
 * 求字符串的组合
 * @author xiaoqing
 *
 */
public class Solution2 {
	
	public void  Permutation(String str) {
		Stack<Character> result = new Stack<Character>();
		char[] array = str.toCharArray();
		for(int i=1;i<=str.length();i++) {
			Permutation(array,0,i,result);
		}
		
    }
	
	void Permutation(char[] array,int begin,int number,Stack<Character> stack) {
		if(number==0) {
			System.out.println(stack.toString());
			return;
		}
		if(begin==array.length) return;
		stack.push(array[begin]);
		Permutation(array,begin+1,number-1,stack);
		stack.pop();
		Permutation(array,begin+1,number,stack);	
	}
	
	

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		solution.Permutation("abc");
   }

}
