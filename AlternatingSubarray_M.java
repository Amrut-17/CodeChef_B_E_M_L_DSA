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
	        int answer[] = new int[size];
	        for(int i=0; i<size; i++){
	            arr[i] = s.nextInt();
	        }
	        for(int j=size-1; j>=0; j--){
	            if(j == size-1){
	                answer[j] = 1;
	            }
	            else if(arr[j]>0 && arr[j+1]<0 || arr[j]<0 && arr[j+1]>0){
	                answer[j] = answer[j+1] +1;
	            }
	            else{
	                answer[j] = 1;
	            }
	        }
	        
	        for(int i=0; i<size; i++){
	            System.out.print(answer[i]+" ");
	        }
	        System.out.println();
	    }
	}
}
