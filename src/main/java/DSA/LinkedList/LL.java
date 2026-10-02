package DSA.LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size=0;
    }
    public void InsertAtIndex(int data,int index){
        if(index==0){
            InsertAtFirst(data);
            return;
        }
        else if(index==size){
            insertLast(data);
            return;
        }
            Node temp=head;
            for(int i=1;i<index;i++){
                temp=temp.next;
            }
        Node node = new Node(data,temp.next);
            temp.next=node;
            size += 1;
    }
//    public void after(int  data,int index){
//        InsertAtIndex(data,index+1);
//    }    works correct with an idnex exception.

    public void insertLast(int data){
        if(tail==null){
            InsertAtFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail= node;
        size+=1;
    }
    public void InsertAtFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if(tail==null){
            tail = node;
        }
        size+=1;
    }
    public Node getRef(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(value==node.data){
                return node;
            }
            node=node.next;
        }
//        for(int i=0;i<size;i++){
//            if(node.data==value){
//                return node;
//            }
//            node=node.next;
//        }
        return null;
    }

//     insert using recursion
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }


    public int DeleteLast(){
        if(size<=1){
            return deleteFirst();
        }
       Node secondLast= getRef(size-2);
        int val=tail.data;
       tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteFirst(){
        int val=head.data;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return DeleteLast();
        }
        Node prev=getRef(index-1);
        int val=prev.next.data;
        prev.next=prev.next.next;
       return val;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    private class Node {
        private int data;
        private Node next;

       public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    // questions

//     1)   Remove duplicates from sorted linked list
    public void duplicates(){
        if(head==null){
            return;
        }
        Node node=head;
        while(node.next!=null){
            if(node.data==node.next.data){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }

    // my code for que 1   ....leetcode
//    public ListNode deleteDuplicates(ListNode head) {
//        return unique(head);
//    }
//    private ListNode unique(ListNode curr){
//        if(curr == null || curr.next == null){
//            return curr;
//        }
//        if(curr.val==curr.next.val){
//            curr.next=curr.next.next;
//            return unique(curr);
//        }else{
//            curr.next=unique(curr.next);
//        }
//        return curr;
//    }

    // question 2) merge 2 sorted linked lists.  very imp question
    public static LL merge(LL first,LL second){
        Node f=first.head;
        Node s=second.head;
        LL ans=new LL();

        while(f!=null && s!=null){
            if(f.data<s.data){
                ans.insertLast(f.data);
                f=f.next;
            }
            else{
                ans.insertLast(s.data);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.data);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.data);
            s=s.next;
        }
        return ans;
    }
     // leetcode ans
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode list=new ListNode();
//         ListNode tail=list;
//         while(list1!=null && list2!=null){
//             if(list1.val < list2.val){
//                 tail.next=list1;
//                 list1=list1.next;
//                 tail=tail.next;
//             }else{
//                 tail.next=list2;
//                 list2=list2.next;
//                 tail=tail.next;
//             }
//         }
//         tail.next=(list1!=null)? list1 :list2;
//         return list.next;
//
//     }

     // question 4 ) cycle detection in linked list ...leetcode 141
//     public boolean hasCycle(ListNode head) {
//         ListNode fast=head;
//         ListNode slow=head;
//
//         while(fast!=null && fast.next!=null){
//             fast=fast.next.next;
//             slow=slow.next;
//             if(fast==slow){
//                 return true;
//             }
//         }
//         return false;
//     }

//    que 5)   find the length of cycle

public void bubbleSort(){
        bubbleSort(size-1,0);
}
private void bubbleSort(int row,int col){
       if(row==0){
           return;
       }
       if(col<row){
           Node first=getRef(col);
           Node second=getRef(col+1);

           if(first.data>second.data){
               //swap
               if(first==head){
                   head=second;
                   first.next=second.next;
                   second.next=first;
               }else if(second==tail){
                   Node prev=getRef(col-1);
                   prev.next=second;
                   tail=first;
                   first.next=null;
                   second.next=tail;
               } else{
                   Node prev=getRef(col-1);
                   prev.next=second;
                   first.next=second.next;
                   second.next=first;
               }
           }
           bubbleSort(row,col+1);
       }else{
           bubbleSort(row-1,0);
       }
}
       // recursion reverse
private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next=node;
        tail=node;
        tail.next=null;
}
   // in place reversal of linkedlist
    // google,amazon,mcirosoft ,apple   ... leetcode 206
    public void reverse(){
        if(size<2){
            return;
        }
        Node prev=null;
        Node present=head;
        Node next=present.next;

        while(present!=null){
            present.next=prev;
            prev=present;
            present=next;
            if(next!=null){
                next=next.next;
            }
        }
        head=prev;
    }


    // reverse linekd lost from between ...leetcode 92
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }

//        skip the first left-1 nodes
        ListNode current=head;
        ListNode prev=null;
        for(int i=0;current !=null && i <left-1;i++){
            prev=current;
            current=current.next;
        }
        ListNode last=prev;
        ListNode newEnd=current;

        // reverse between left and right
        ListNode next=current.next;
        for(int i=0;current !=null && i<right-left+1;i++){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;

        return head;
    }

//    public boolean isPalindrome(){
//        ListNode mid=(head);
//    }



    public static void main(String[] args) {
        LL first=new LL();
        LL second=new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans=LL.merge(first,second);
        ans.display();

        LL list=new LL();
        for(int i=7;i>0;i--){
            list.insertLast(i);
        }
        list.display();
        list.bubbleSort();
        list.display();

    }



}
