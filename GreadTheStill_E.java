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
	   int t ;
	   t = s.nextInt();
	   while(t-->0){
	       int hardness = s.nextInt();
	       double carbonContent = s.nextDouble();
	       int tensileStrength = s.nextInt();
	       
	       if(hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600){
	           System.out.println(10);
	       }
	       else if(hardness > 50 && carbonContent < 0.7){
	           System.out.println(9);
	       }
	       else if(carbonContent < 0.7 && tensileStrength > 5600){
	           System.out.println(8);
	       }
	       else if(hardness > 50 && tensileStrength > 5600){
	           System.out.println(7);
	       }
	       else if(hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600){
	           System.out.println(6);
	       }
	       else{
	           System.out.println(5);
	       }
	   }
	}
}
