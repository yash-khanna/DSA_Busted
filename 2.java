// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String[] S = read.readLine().split(" ");
            int A=Integer.parseInt(S[0]);
            int B=Integer.parseInt(S[1]);
            int C=Integer.parseInt(S[2]);
            Solution ob = new Solution();
            System.out.println(ob.middle(A,B,C));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int middle(int A, int B, int C){
        //code here
        int max = A;
        int min = A;
        int middle = A;
        if (max > B && max > C){
            max = A;
            if (B > C){
                return B;
            } else {
                return C;
            }
        } else if (B > A && B > C){
            max = B;
            if (A > C){
                return A;
            } else {
                return C;
            }
        } else {
            max = C;
            if (A > B){
                return A;
            } else {
                return B;
            }
        }
    }
}
