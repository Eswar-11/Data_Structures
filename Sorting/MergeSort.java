import java.util.*;
class  MergeSort   //Merge two sorted arrays 
                   //Naive Code
{ 
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
	      System.out.print("length_1: ");
	      int n1=sc.nextInt();
        System.out.print("length_2: ");
	      int n2=sc.nextInt();
	      int[] arr1=new int[n1];
	      System.out.print("Array-1: ");                    
	      for(int b=0; b<n1; b++)
        {
            arr1[b]=sc.nextInt();
        }
        int[] arr2=new int[n2];
	      System.out.print("Array-2: ");                    

      
        for(int b=0; b<n2; b++)
        {
            arr2[b]=sc.nextInt();
	      }
        int[] arr=new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            arr[i]=arr1[i];
        }
        for(int j=0;j<n2;j++)
        {
            arr[j+n1]=arr2[j];
        }        
        Arrays.sort(arr);
           
      
        for(int e=0;e<n1+n2;e++)
        {
            System.out.print(arr[e] + " ");
        }
    }  
}
