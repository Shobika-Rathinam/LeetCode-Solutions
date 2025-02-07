class Solution {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> s = new ArrayDeque<>();
        ListNode N=head;
        while(N!=null)
        {
            s.push(N.val); 
            N=N.next;
        }
        N=head;
        while(N!=null)
        {
            if(N.val!=s.pop())
            {
                return false;
               
            }else{
                N=N.next;     
            }
        }
        return true;
    }
}
