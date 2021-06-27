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
		long t = s.nextLong();
		while(t-->0){
		    long n = s.nextLong();
		    long a = s.nextLong();
		    long b = s.nextLong();
		    System.out.println( (2*(180+n)) - (a+b));
		}
	}
}
