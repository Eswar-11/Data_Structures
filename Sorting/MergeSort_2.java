import java.util.*;
class  MergeSort   //Merge two sorted arrays 
                   //Efficient Code
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
        
        
        int i=0,j=0;
        while(i<n1 && j<n2)
	{
            if(arr1[i]<arr2[j])
                System.out.print(arr1[i++]+" ");
            else
                System.out.print(arr2[j++]+" ");
        }
        while(i<n1)
            System.out.print(arr1[i++]+" ");
        while(j<n2)
            System.out.print(arr2[j++]+" ");  
         
      
        }
    }  
}
