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
		double total = 0;
		double ans;
		double t, q, p;
		t = s.nextInt();
		while(t-->0){
		    q = s.nextInt();
		    p = s.nextInt();
		    if(q>1000){
		        ans = p*q;
		        total = (90*ans)/100;
		    }
		    else{
		        total = p*q;
		    }
		    System.out.format("%.6f",total);
		    System.out.println();
		 }
	}
}
