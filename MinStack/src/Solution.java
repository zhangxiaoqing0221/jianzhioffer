import java.util.Stack;

public class Solution {
	private Stack<Integer> minStack = new Stack<Integer>();
	private Stack<Integer> dataStack = new Stack<Integer>();
	
	 public void push(int node) {
	        dataStack.push(node);
	        if(minStack.isEmpty()) minStack.push(node);
	        else {
	        int min = minStack.peek();
	        if(node < min) minStack.push(node);
	        else minStack.push(min);
	        }
	    }
	    
	    public void pop() {
	    	dataStack.pop();
	    	minStack.pop();
	        
	    }
	    
	    public int top() {
	        return dataStack.peek();
	    }
	    
	    public int min() {
	        return minStack.peek();
	    }
	    

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.push(2);
		solution.push(1);
		System.out.println(solution.min());

	}

}
