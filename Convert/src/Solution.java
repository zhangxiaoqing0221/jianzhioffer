
public class Solution {
	
	 TreeNode lastNode = null;
	 public TreeNode Convert(TreeNode pRootOfTree) {
		TreeNode head = pRootOfTree;
		if(pRootOfTree!=null) {
			ConvertCore(pRootOfTree);
			while(pRootOfTree!=null) {
				head = pRootOfTree;
				pRootOfTree = pRootOfTree.left;
			}
		}
		 return head;
	    }
	 
	//中序遍历
	 public void ConvertCore(TreeNode pNode) {
		 if(pNode==null) return;
		 //左子树
		 if(pNode.left!=null) ConvertCore(pNode.left);
		 //转换
		 TreeNode pCurrent = pNode;
		 pCurrent.left = lastNode;
		 if(lastNode!=null) lastNode.right = pCurrent;
		 //将head指向当前结点
		 lastNode = pCurrent;
		 //右子树
		 if(pNode.right!=null) ConvertCore(pNode.right);
		 
	 }

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(10);
		TreeNode node2 = new TreeNode(6);
		TreeNode node3 = new TreeNode(14);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(8);
		TreeNode node6 = new TreeNode(12);
		TreeNode node7 = new TreeNode(16);
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		
	Solution solution = new Solution();
	TreeNode list = solution.Convert(node1);
	while(list!=null) {
		System.out.println(list.val);
		list = list.right;
	}
	while(list!=null) {
		System.out.println(list.val);
		list = list.left;
	}
	

	}

}
