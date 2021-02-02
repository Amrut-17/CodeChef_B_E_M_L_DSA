/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            long n = s.nextInt();
            System.out.println(currency(n));
        } 
	}
	static long currency(long n){
	    if(n<12){return n;}
	    else {
	        return currency(n/2)+currency(n/3)+currency(n/4);
	    }
	}
}
