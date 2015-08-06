
public class Solution {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null || pHead2==null) return null;
		 int length1 = GetLength(pHead1);
		 int length2 = GetLength(pHead2);
		 int diff = length1-length2;
		 ListNode longer = pHead1;
		 ListNode shorter = pHead2;
		 if(length1<length2) {
			 diff = length2-length1;
			 longer  = pHead2;
			 shorter = pHead1;
		 }
		 for(int i=0;i<diff;i++) {
			 longer  = longer.next;
		 }
		 
		 while(longer!=null&&shorter!=null&&longer!=shorter) {
			 longer = longer.next;
			 shorter = shorter.next;
		 }
		 
		 return longer;
    }
	
	int GetLength(ListNode head) {
		int result = 0;
		ListNode node = head;
		while(node!=null) {
			result++;
			node = node.next;
		}
		return result;
		
	}

	public static void main(String[] args) {
		Solution soution = new Solution();

	}

}
