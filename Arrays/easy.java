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
//2]Second Largest Element in an Array without sorting
public class Main{
    public static void main(String[] args){
        int[] arr={1,92,3,4,15,6,7,8,9,12};
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest and arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("The second largest element is : "+ secondLargest);
    }
}
//3]Check if the array is sorted
public class Main
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10};
		boolean ans=true;
		for(int i=0;i<a.length-1;i++){
		    if(a[i]>a[i+1]){
		        ans=false;
		    }
		}
		if(ans){
		    System.out.println("The array is sorted");
		}
		else{
		    System.out.println("The array is not sorted");
		}
	}
}

//4]Remove duplicates from Sorted array
public class Main{
    public static void main(String[] args){
        int[] a={1,1,1,1,2,2,2,2,3,3,4,4,56,6,7,78,8,89};
        int f=0;
        int temp=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=a[f]){
                f+=1;
                temp=a[f];
                a[f]=a[i];
                a[i]=temp;
                count+=1;
            }
        }
        if(count!=0){
            for(int i=0;i<count+1;i++){
            System.out.println(a[i]);
            }
        }else{
            System.out.println("The array is empty.");
        }
        
    }
}
//5]Left Rotate an array by one place
//6]Left rotate an array by D places

//7]
//8]
//9]
//10]
//11]
//12]
//13]
//14]
