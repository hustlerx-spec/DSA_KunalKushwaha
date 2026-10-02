package DSA.LinkedList;

public class DLL {

    Node head;


    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
//    public void insertLast(int val) {
//        if(head==null){
//            insertFirst(val);
//            return;
//        }
//        Node node = new Node(val);
//        Node temp=head;
//        Node last=null;
//        while(temp!=null){
//            last=temp;
//            temp=temp.next;
//        }
//        last.next=node;
//        node.prev=last;
//        node.next=null;
//    }    my version but totally corrcet

        public void insertLast(int val) {
        Node node = new Node(val);
        Node last=head;
        node.next=null;
            if(head==null){
                node.prev=null;
                head=node;
                return;
            }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(value==node.val){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insertAfter(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    public void display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.val +" -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");

        System.out.println("Reverse display");
        while(last!=null){
            System.out.print(last.val +" -> ");

            last=last.prev;
        }
        System.out.println("START");
    }



    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
