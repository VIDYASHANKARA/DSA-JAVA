public class Insertion {
    //insertion at head
    private static Node InsertAtHead(Node head,int value){
        Node neww=new Node(value);
        neww.next=head;
        return neww;
    }

    //insert at tail
    private static Node InsertAtTail(Node head, int value){
        if(head==null){
            Node neww=new Node(value,null);
            return neww;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node neww=new Node(value,null);
        temp.next=neww;
        return head;
    }
    //insert at k   need to improvise
    private static Node InsertAtK(Node head,int k,int value){
        if(k<=0){
            return head;
        }
        if(k==1){
            Node neww=new Node(value,head);
            return neww;
        }

        int count=1;
        Node temp=head;

        while(count!=k && temp!=null){
            temp=temp.next;
            count++;
        }
        if(temp==null) return head;
        Node neww=new Node(value,temp.next);
        neww.next=temp.next.next;
        return head;
    }

    public static void main(String[] args){

    }
}
