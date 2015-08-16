
public class Solution {
	 public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		 boolean result = false;
		 if(root1!=null&&root2!=null) {
			 if(root1.val==root2.val) result = isSubtree(root1,root2);
			 if(!result) result = HasSubtree(root1.left,root2); //注意判断条件
			 if(!result) result = HasSubtree(root1.right,root2);
		 }
	      return result;  
	  }
	 
	  boolean isSubtree(TreeNode root1,TreeNode root2) {
		  if(root2==null) return true;
		  if(root1==null) return false;
		  if(root1.val!=root2.val) return false;
		  return isSubtree(root1.left,root2.left)&&isSubtree(root1.right,root2.right);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
