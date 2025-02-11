//3
class Node{
    int data;
    Node prev;
    Node next;

    Node(int data1,Node prev1,Node next1){
        this.data=data1;
        this.prev=prev1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.prev=null;
        this.next=null;
    }
}
public class DeletionDll {
    private static Node DeleteHead(Node head){
        if(head==null) return head;
        if(head.next==null) return null;
        Node temp=head;
        temp=temp.next;
        temp.prev=null;
        head.next=null;
        head=temp;
        return head;
        //better one
        //head=head.next;
        //head.prev=null;
        //return head;
    }
    private static Node deleteTail(Node head){
        if(head==null) return head;
        if(head.next==null) return null;
        Node temp=head;
        Node back=null;
        while(temp.next!=null){
            back=temp;
            temp=temp.next;
        }
        back.next=null;
        temp.prev=null;
        return head;
        // private static Node deleteTail(Node head) {
        //     if (head == null || head.next == null) return null; // Empty or single-node list

        //     Node temp = head;
        //     while (temp.next.next != null) { // Stop at second-last node
        //         temp = temp.next;
        //     }

        //     temp.next = null; // Remove reference to the last node
        //     return head;
        // }
    }
    private static Node DeleteAtK(Node head, int k){
        if(head==null || head.next==null) return null;
        if(k==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        int count=0;
        Node temp=head;
        while(count<k){
            count++;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        temp.next.prev=null;
        return head;
    }
    public static void main(String[] args){

    }
}
