//** Here we take a single array with three points namely, the lower, the middle and the highest point. The elements from the lower to the middle are sorted and the elements from the (middle+1) to the higher are sorted. The task is to merge these two sorted parts into one.

import java.util.*;
class  MergeSort_3
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
        System.out.print("low: ");
	      int l=sc.nextInt();
        System.out.print("Mid: ");
	      int m=sc.nextInt();
        System.out.print("High: ");
	      int h=sc.nextInt();
        
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++]; 
      
        for(int e=0;e<n;e++){
            System.out.print(arr[e] +" ");
        }
    } 
}
