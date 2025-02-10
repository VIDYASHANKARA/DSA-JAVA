//4 Deletion

public class Deletion {
//code for deleting head//
    private static Node DeleteHead(Node head){
        if(head==null) return null;
        Node temp=head;
        head=head.next;
        return head;
//code//
//code for deleting tail//
    private static Node DeleteTail(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
//code//
//code for deleting kth position//
    private static Node Deletek(Node head, int k){
        if(head==null) return head;
        if(k==1){
            head=head.next;
            return head;
        }
        Node temp=head;
        int count=0;
        Node previous=null;
        while(temp!=null){
            count++;
            if(count==k){
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;
        }
        return head;
    }
//code//
//code for deleting a certain value//
    private static Node DeleteValue(Node head,int value){
        if(head==null) return head;
        if(head.data==value){
            return head.next;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=null){
            if(temp.data==value){
                if(prev!=null){prev.next=temp.next;}

                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
//code//
    }
    public static void main(String[] args){

 }
}

