//1]Largest Element in an Array
public class Main{
    public static void main(String[] args){
        int[] arr={1,92,3,4,15,6,7,8,9,12};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest element is : "+largest);       
    }
}
