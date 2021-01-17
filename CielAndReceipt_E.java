/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int arr[] = new int[12];
		int i, count=0;
		int t;
		int n;
		
		for(i=0; i<12; i++){
		    arr[i] = (int) Math.pow(2,i);
		}
		
		t = s.nextInt();
		while(t>0){
		    n = s.nextInt();
		    while(n>0){
		        for(i=11; i>=0; i--){
		            if(n >= arr[i]){
		                n = n-arr[i];
		                count += 1;
		                i += 1;
		            }
		        }
		    }
		    System.out.println(count);
		    count = 0;
		    t -= 1;
		}
	}
}
