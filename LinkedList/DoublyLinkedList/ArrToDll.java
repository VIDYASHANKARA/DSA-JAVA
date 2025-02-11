//2
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

public class ArrtoDll {
    private static Node ArrtoDll(int[] arr){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],prev,null);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
    }
}
