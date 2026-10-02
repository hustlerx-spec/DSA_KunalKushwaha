package DSA.LinkedList;

public class CycleQuestions {
         public boolean hasCycle(ListNode head) {
         ListNode fast=head;
         ListNode slow=head;

         while(fast!=null && fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if(fast==slow){
                 return true;
             }
         }
         return false;
     }
//  que 5)   find length of cycle
    public int len(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //calculate the length
                ListNode temp=slow;
                int len=0;
                do{
                    temp=temp.next;
                    len++;
                }while(temp!=fast);
                return len;
            }
        }
        return 0;
    }

//    que 6  find starting point of cycle very very very imp and confusing question
    public ListNode detectCycle(ListNode head) {
             int length=0;

             ListNode slow=head;
             ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //calculate the length
                length=len(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        //find the start node
        ListNode f=head;
        ListNode s=head;

        while(length>0){
            s=s.next;
            length--;
        }
        //keep moving both forward and they will meet at cycle start
       while(s!=f){
           f=f.next;
           s=s.next;
           return s;
       }
        return s;
    }

//    que 7  ) Happy number leetcode .....imp...// google
    public boolean isHappy(int n){
             int slow=n;
             int fast=n;
             do{
                 slow=findSquare(slow);
                 fast=findSquare(findSquare(fast));
             }while(slow!=fast);

             if(slow==1){
                 return true;
             }
      return false;
    }
    private int findSquare(int num){
             int ans=0;
             while(num>0){
                 int rem= num%10;
                 ans+=rem*rem;
                 num=num/10;
             }
        return ans;
    }
//      que 8)   find middle node of the linked list in single pass
    public ListNode middleNode(ListNode head){
             ListNode s=head;
             ListNode f=head;

             while(f!=null &&  f.next!=null){
               s=s.next;
               f=f.next.next;
             }
             return s;
    }

}
class ListNode {
    int val;
    ListNode next;
}
