import java.util.ArrayList;
import java.util.Stack;
public class Solution {
     public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<Integer> stack = new Stack<Integer>();
            ListNode node  = listNode;
            while(node != null) {
                stack.push(node.val);
                node = node.next;
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            while(!stack.empty()) {
                arrayList.add(stack.peek());
                stack.pop();
            }
            return arrayList;
        }
}