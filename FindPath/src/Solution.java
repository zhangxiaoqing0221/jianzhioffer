import java.util.ArrayList;
import java.util.Stack;
public class Solution {
	
public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
	 ArrayList<ArrayList<Integer>> list = new  ArrayList<ArrayList<Integer>>();
	 if(root==null) return list;
	 int currentSum = 0;
	 Stack<Integer> stack = new Stack<Integer>();
	 FindPathCore(root,target,currentSum,stack,list);
	return list;
    }

public void FindPathCore(TreeNode root,int target,int currentSum, Stack<Integer> stack, ArrayList<ArrayList<Integer>> list){
	currentSum +=root.val;
	stack.push(root.val);
	if(root.left==null&&root.right==null&&currentSum==target) {
		list.add(new ArrayList<Integer>(stack));
	}
	
	if(root.left!=null) FindPathCore(root.left,target,currentSum,stack,list);
	if(root.right!=null) FindPathCore(root.right,target,currentSum,stack,list);
	currentSum -= root.val; //注意减掉当前的值
	stack.pop();
}

	
	
 

	public static void main(String[] args) {
		TreeNode node = new TreeNode(10);
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(12);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(7);
		node.left = node1;
		node.right = node2;
		node1.left = node3;
		node1.right = node4;
		Solution solution = new Solution();
		ArrayList<ArrayList<Integer>> list = solution.FindPath(node, 22);
		for(ArrayList<Integer> array:list){
			System.out.println("****");
			for(Integer integer:array) {
				System.out.print(integer+" ");
			}
			System.out.println("****");
			System.out.println();
			
		}	
		

	}

}
