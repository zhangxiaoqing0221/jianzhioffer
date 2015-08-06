
public class Solution {
	 ListNode deleteDuplication(ListNode pHead)
	    {
	        ListNode pre=new ListNode(Integer.MIN_VALUE);
	        pre.next=pHead;
	 
	        ListNode head=pHead;
	 
	        int deleteVal=Integer.MIN_VALUE;
	 
	        ListNode next=null;
	        ListNode cur=pHead;
	        while(cur!=null){
	            next=cur.next;
	            if(next!=null&&cur.val==next.val) {//如果当前节点等于下一个节点 则标记有点重复
	                deleteVal=cur.val;
	            }
	 
	            ListNode inCur=cur;
	            while (inCur!=null&&inCur.val==deleteVal){//当前指针不为空 且当前指针值等于待删值 删除节点
	                if(head==cur) {//如果删除当前的节点是头结点
	                    head = inCur.next;//删除当前节点
	                    inCur = head;//.next;//指向当前节点下一个节点
	                }else {
	                    pre.next = inCur.next;//删除当前节点
	                    inCur = pre.next;//.next;//指向当前节点下一个节点
	                }
	            }
	            //如果后边一个跟当前不同则设置pre
	            if(inCur!=null&&inCur.next!=null&&inCur.val!=inCur.next.val){
	                pre=cur;
	            }
	 
	            cur=cur.next;
	 
	        }
	 
	        return head;
	    }

	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(4);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		ListNode result = solution.deleteDuplication(node1);
		while(result!=null) {
			System.out.println(result.val);
			result = result.next;
		}
	}

}
