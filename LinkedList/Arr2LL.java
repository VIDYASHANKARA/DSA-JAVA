//2 Converting an array into a linked list
class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
};
public class ArrToLl {
    private static Node convertArr2Ll(int[] arr){
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length; i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7};
        Node head=convertArr2Ll(arr);
        System.out.print(head.data);
    }
}
