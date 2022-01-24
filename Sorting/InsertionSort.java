import java.util.*;
class InsertionSort
{ 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
	System.out.print("length: ");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.print("Array: ");                    
	for(int b=0; b<n; b++)
        {
            arr[b]=sc.nextInt();
        }   
         iSort(arr,n);
         
        for(int x: arr)
	        System.out.print(x+" ");
    }
    static void iSort(int arr[],int n){
    
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
