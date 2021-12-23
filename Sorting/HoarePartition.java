import java.util.*;
class HoarePartition
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
        System.out.print("Low: ");
        int l=sc.nextInt();
        System.out.print("High: ");
        int h=sc.nextInt();
        
        partition(arr,0,n-1);
        for(int x: arr)
	        System.out.print(x+" ");
    }
    static int partition(int arr[], int l, int h)
    {   
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);
            do{
                j--;
            }while(arr[j]>pivot);
            if(i>=j)
            return j;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
