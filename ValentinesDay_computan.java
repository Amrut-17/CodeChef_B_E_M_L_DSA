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
	        int size = s.nextInt();
	        int arr[] = new int[size];
	        for (int i=0; i<size; i++){
	            arr[i] = s.nextInt();
	        } 
	        int max_so_far = Integer.MIN_VALUE;
	        int max_end_here = 0;
	        for(int j=0; j<size; j++){
	            max_end_here = max_end_here + arr[j];
	            if(max_end_here>max_so_far){
	                max_so_far = max_end_here;
	            }
	            if(max_end_here<0){
	                max_end_here = 0;
	            }
	        }
	        System.out.println(max_so_far);
	    }
    }
}
