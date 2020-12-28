// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int i = 0;
        int j = str.length()-1;
        // System.out.println(a + " " + b);
        while(i<j){
            String a = str.substring(i, i+1);
            String b = str.substring(j, j+1);
            String temp = a;
            a = b;
            b = temp;
            str = str.substring(0, i) + a + str.substring(i+1, j) + b + str.substring(j+1);
            i++;
            j--;
        }
        return str;
    }
}
