
public class Solution {
public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	if(pre==null||in==null) return null;
	return ConstructCore(pre,0,pre.length-1,in,0,in.length-1);
        
    }


TreeNode ConstructCore(int[] pre, int preStart,int preEnd,int[] in,int inStart,int inEnd) {
	TreeNode root = new TreeNode(pre[preStart]);
	//只有一个结点的情况
	if(preStart==preEnd) {
		if(inStart==inEnd&&pre[preStart]==in[inStart]) {
			return root;
		}
		else return null;
	}
	//在中序遍历中找到根结点的值
	int left = inStart;
	while(left<=inEnd) {
		if(in[left]==root.val) break;
		else left++;
	}
	
	int leftLength = left-inStart;
	int leftPreEnd = preStart + leftLength;
	
	//若有左子树则构建左子树
	if(leftLength>0) {
		root.left = ConstructCore(pre,preStart+1,leftPreEnd,in,inStart,left-1);		
	}
	//若有右子树则构建右子树
	if(leftLength<preEnd-preStart) {
		root.right =  ConstructCore(pre,leftPreEnd+1,preEnd,in,left+1,inEnd);		
	}
	return root;		
}

//遍历二叉树
public void endOrder(TreeNode node) {
	if(node.left!=null) endOrder(node.left);
	if(node.right!=null) endOrder(node.right);
	System.out.println(node.val);	
}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] pre = new int[] {1,2,4,7,3,5,6,8};
		int[] in = new int[] {4,7,2,1,5,3,8,6};
		TreeNode node = solution.reConstructBinaryTree(pre, in);
		solution.endOrder(node);

	}

}
