import java.util.*;
class  BubbleSort 
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
                  for(int i=0;i<n;i++){
                      boolean a=false;
                      for(int j=0;j<n-i-1;j++){
                        if( arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    a= true;                   
                }
            }
            if(a == false)
            break; 
        }
                  for(int e=0;e<n;e++){
                  System.out.print(arr[e] + " ");
                  }
    }  
}
