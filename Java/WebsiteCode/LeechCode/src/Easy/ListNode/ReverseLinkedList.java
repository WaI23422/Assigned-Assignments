package Easy.ListNode;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[][] tests = {
            {1,2,3,4,5},
            {1,2,3,4,5,6},
            {1,2,3},
            // {1,2},
            // {1},
            // {}
        }; 

        for (int[] test : tests) {
            ListNode headA = ListNode.addNode(test);
            ListNode ans = new ReverseLinkedList_Solution().reverseList(headA);
            
            System.out.println(ans == null? null : ans.toString());
        }
    }
}

// 0 ms 42.8 MB
class ReverseLinkedList_Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {return head;}

        ListNode prevHead = head, inverListNode = head.next; 
        
        while (head.next != null && head.next.next != null) {
            head.next = head.next.next;
            inverListNode.next = prevHead;
            prevHead = inverListNode;
            inverListNode = head.next;
        }   
        
        inverListNode.next = prevHead;
        head.next = null;

        return inverListNode;
    }
}
