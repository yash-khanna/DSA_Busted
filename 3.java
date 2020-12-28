// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    int k=sc.nextInt();
		    
		    System.out.println(kthSmallest(arr, 0, n-1, k));
		}
	}
	

    
 // } Driver Code Ends


//User function Template for Java

public static int[] mergeSort(int arr[], int start, int end) 
{
    if (start == end) {
        int a1[] = new int[1];
        a1[0] = arr[start];
        return a1;
    }
    int middle = (start + end)/2;
    int one[] = mergeSort(arr, start, middle);
    int two[] = mergeSort(arr, middle+1, end);
    int mergeArray[] = merge(one, two);
    return mergeArray;
} 

public static int[] merge(int one[], int two[])
{
    int i = 0;
    int j = 0;
    int k = 0;
    int merge[] = new int[one.length + two.length];
    while(i<one.length && j<two.length){
        if (one[i] < two[j]) {
            merge[k] = one[i];
            k++;
            i++;
        } else {
            merge[k] = two[j];
            k++;
            j++;
        }
    }
    
    while (i < one.length) {
        merge[k] = one[i];
        k++;
        i++;
    }
    
    while(j < two.length) {
        merge[k] = two[j];
        k++;
        j++;
    }
    return merge;
}

public static int kthSmallest(int[] arr, int l, int r, int k) 
{
    arr = mergeSort(arr, 0, arr.length - 1);
    return arr[k-1];
} 


// { Driver Code Starts.


}
  // } Driver Code Ends
