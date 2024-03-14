package BetterCodeAnswer.Easy.ListNode;

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

// 0 ms 42.33 MB
class ReverseLinkedList_Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode curr1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr1;
        }
        return prev;
    }
}