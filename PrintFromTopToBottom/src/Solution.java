import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		if (root == null) return array;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode node = root;
		queue.add(node);
		array.add(node.val);
		while (!queue.isEmpty()) {
			node = queue.poll();
			if (node.left != null) {
				queue.add(node.left);
				array.add(node.left.val);
			}
			if (node.right != null) {
				queue.add(node.right);
				array.add(node.right.val);
			}
		}

		return array;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
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
		ArrayList<Integer> array = solution.PrintFromTopToBottom(node);
		for(Integer integer:array) {
			System.out.print(integer+" ");
		}

	}

}
