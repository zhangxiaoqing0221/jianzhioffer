
public class Solution {
	
	    public int TreeDepth(TreeNode root) {
	    	if(root==null) return 0;
	    	int left  = TreeDepth(root.left);
	    	int right  = TreeDepth(root.right);
	    	return left>right?(left+1):(right+1);	        
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
