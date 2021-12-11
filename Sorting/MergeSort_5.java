//Taking two sorted arrays and picking out the intersection elements from the two arrays.

import java.util.*;
class  MergeSort_5
{ 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
	      System.out.print("length-1: ");
	      int n1=sc.nextInt();
	      int[] arr1=new int[n1];
	      System.out.print("Array-1: ");                    
	      for(int b=0; b<n1; b++)
        {
            arr1[b]=sc.nextInt();
        }
        System.out.print("length-2: ");
	      int n2=sc.nextInt();
	      int[] arr2=new int[n2];
	      System.out.print("Array-2: ");                    
	      for(int b=0; b<n2; b++)
        {
            arr2[b]=sc.nextInt();
        }
        
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(i>0 && arr1[i-1]==arr1[i]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                System.out.print(arr1[i]+" ");
                i++;j++;
            }
        }    
    } 
}
