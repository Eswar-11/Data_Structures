import java.util.*;
class QuickSortLomutoPartition
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
         qSort(arr,0,n-1);
         
        for(int x: arr)
	        System.out.print(x+" ");
    }
    static int iPartition(int arr[], int l, int h)
    {   
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }
    
    static void qSort(int arr[],int l,int h){
        if(l<h){
            int p=iPartition(arr,l,h);
            qSort(arr,l,p-1);
            qSort(arr,p+1,h);
        }
    }
}
