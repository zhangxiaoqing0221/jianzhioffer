import java.util.Stack;

public class Solution {
	
	public boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA.length!=popA.length) return false;
		if(pushA.length==0&&popA.length==0) return false;
		Stack<Integer>  dataStack = new Stack<Integer>();
		int p1 = 0;
		int p2 = 0;
		while(p2 < popA.length) {
			
			if(p1<pushA.length && pushA[p1]!=popA[p2]) {
				dataStack.push(pushA[p1]);
				p1++;
			}else if(p1<pushA.length && pushA[p1]==popA[p2]) {
				p1++;
				p2++;
			}else if(dataStack.peek()==popA[p2]) {
				dataStack.pop();
				p2++;
			}else {
				break;
			}	
			
		}
		
		if(p2==popA.length) return true;
		
		return false;
	      
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] pushA = new int[] {1,2,3,4,5};
		int [] popA = new int[] {4,5,3,2,1};
		System.out.println(solution.IsPopOrder(pushA, popA));
		

	}

}
