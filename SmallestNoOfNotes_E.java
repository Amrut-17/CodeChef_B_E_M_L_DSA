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
		int arr[] = {1,2,5,10,50,100};
		int t = s.nextInt();
		int result ;
		for(int i=0; i<t; i++){
			int amt = s.nextInt();
			result = 0;
			while(amt>0){
				for(int j=arr.length-1; j>=0; j--){
					result = result + (amt/arr[j]);
					amt = amt%arr[j];
				}
			}
			System.out.println(result);
		}
	}
}
