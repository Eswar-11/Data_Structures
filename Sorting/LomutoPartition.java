import java.util.*;
class LomutoPartition
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
        for(int e=0;e<n;e++)
        {
            System.out.print(arr[e] +" ");
        }
    }
}
