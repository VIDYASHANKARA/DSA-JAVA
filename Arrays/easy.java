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
//***********************************************************************************************
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
//***********************************************************************************************
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
//***********************************************************************************************
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
//***********************************************************************************************
//5]Left Rotate an array by one place
//6]Left rotate an array by D places
public class Main
{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9,10};
		int d=10;
		int[] b=new int[a.length];
		for(int i=d;i<a.length;i++){
		    b[i-d]=a[i];
		}
		for(int i=0;i<d;i++){
		    b[a.length-d+i]=a[i];
		}
		for(int i=0;i<b.length;i++){
		    System.out.println(b[i]);
		}		
	}
}
//***********************************************************************************************
//7]Move Zeros to end
public class Main{
    public static void main(String[] args){
        int[] a={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int[] b=new int[a.length];
        int v=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                b[v]=a[i];
                v+=1;
            }
        }
        for(int i=b.length-1;i<a.length-b.length;i++){
            b[i]=0;
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
//***********************************************************************************************
//8]Linear Search
public class Main{
    public static void main(String[] args){
        int[] a={1,2,34,5,67,434,2,6,3,4,6,84};
        int search_element=2;
        for(int i=0;i<a.length;i++){
            if(a[i]==search_element){
                System.out.println(i);
            }
        }
    }
}
//***********************************************************************************************
//9]Find the Union
//10]Find missing number in an array
//11]Maximum Consecutive Ones
//12]Find the number that appears once, and other numbers twice.
//13]Longest subarray with given sum K(positives)
//14]Longest subarray with sum K (Positives + Negatives)
