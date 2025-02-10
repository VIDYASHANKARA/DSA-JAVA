//3 Traversal of Linked list
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
}
public class Traversal {
    private static int Traversall(int[] arr){
        int count=1;
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++) {
            mover.next=new Node(arr[i]);
            mover=mover.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        int y=Traversall(arr);
        System.out.print(y);
    }
}
