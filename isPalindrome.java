/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode small=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            small=small.next;
         fast=fast.next.next;
        }
        ListNode prev=null;
        while(small!=null){
            ListNode next=small.next;
            small.next=prev;
            prev=small;
            small=next;
        }  
        ListNode left=head;
        ListNode right=prev;
        while(right!=null){
            if(right.val!=left.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }return true;

    }
}
