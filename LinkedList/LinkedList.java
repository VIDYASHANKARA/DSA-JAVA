//1 Linked list
class node{
    int data;
    node next;

    node(int data1,node next1){
        this.data=data1;
        this.next=next1;
    }

    node(int data1){
        this.data=data1;
        this.next=null;
    }
}
public class LL{
public static void main(String[] args){
    int[] x={1,2,3,4,5,6,7};
    node y=new node(x[2]);
    System.out.print(y.data);
}
}
