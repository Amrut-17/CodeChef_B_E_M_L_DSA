/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0){
	        int odd =0;
	        int even = 0;
	        int n = s.nextInt();
	        int[] arr = new int[n];
	        for (int i=0; i<n; i++){
	            arr[i] = s.nextInt();
	            if(arr[i]%2 != 0){odd += 1 ;}
	            else{ even+=1;}
	        }
	        if(odd>even){
	        System.out.println(even);}
	        else{ System.out.println(odd);}
	    }
	}
}
