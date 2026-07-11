class Solution {
  public ListNode reverseHelper(ListNode prev,ListNode curr){
    if(curr==null){
        return prev;
    }
    ListNode next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
    return reverseHelper(prev,curr);
  }

    public ListNode reverseList(ListNode head) {
       return reverseHelper(null,head);
    }
}