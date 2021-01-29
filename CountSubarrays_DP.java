/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CountSubarrays_DP
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
	    int t = s.nextInt();
	    while(t-->0){
	        int n = s.nextInt();
	        long count = 1;
	        int previous = s.nextInt();
	        int current = 1;
	        for(int i=1; i<n; i++){
	            int element = s.nextInt();
	            if(element >= previous) current += 1;
	            else current = 1;  
	            count += current;
	            previous = element;
	        }
	        System.out.println(count);
	    }
	}
}
