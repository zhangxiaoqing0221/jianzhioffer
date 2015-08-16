
public class Solution {

	//前序遍历
	 public void Mirror(TreeNode root) {
		if(root==null) return;
		if(root.left==null&&root.right==null) return;
		 TreeNode temp = root.left;
		 root.left = root.right;
		 root.right = temp;
		if(root.left!=null) Mirror(root.left);
		if(root.right!=null) Mirror(root.right);     
	    }
	 
	 
	public void preOrder(TreeNode root) {
		 if(root!=null) System.out.println(root.val);
			if(root.left!=null) preOrder(root.left);
			if(root.right!=null) preOrder(root.right);   
	 }
	 
	public static void main(String[] args) {
		TreeNode node = new TreeNode(8);
		TreeNode node1 = new TreeNode(6);
		TreeNode node2 = new TreeNode(10);
		TreeNode node3 = new TreeNode(5);
		TreeNode node4 = new TreeNode(7);
		TreeNode node5 = new TreeNode(9);
		TreeNode node6 = new TreeNode(11);
		node.left = node1;
		node.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		
		Solution solution = new Solution();
		solution.Mirror(node);
		solution.preOrder(node);

	}

}
