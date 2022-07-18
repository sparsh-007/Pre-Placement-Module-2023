class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        if(size==1){
            return temp.next;
        }
        if(size==n){
               head=head.next;
            return head;
        }
        for(int i=1;i<size-n;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}
