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
		int noOfSoldire;
		int noOfWepan;
		int lucky = 0, unlucky = 0;
		noOfSoldire = s.nextInt();
		for(int i=0; i<noOfSoldire; i++){
		    noOfWepan = s.nextInt();
		    if(noOfWepan%2 == 0){
		        lucky += 1;
		    }
		    else{
		        unlucky += 1;
		    }
		}
		if(lucky>unlucky){
		    System.out.println("READY FOR BATTLE");
		}
		else{
		    System.out.println("NOT READY");
		}
	}
}
