import java.util.*;
class  SelectionSort 
{ 
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.print("length: ");
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    System.out.print("Array: ");                    
		    for(int b=0; b<n; b++){
		         arr[b]=sc.nextInt();
		    }
                  for(int i = 0; i < n; i++)
                  {
                    int min_ind = i;
                    for(int j = i + 1; j < n; j++)
                    {
                        if(arr[j] < arr[min_ind])
                        {
                        min_ind = j;
                    }
                }
            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
                  for(int e=0;e<n;e++)
                  {
                      System.out.print(arr[e] + " ");
                  }
    }  
}
