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
        s.nextLine();
        while(t-->0){
            int countA =0;
            int countB = 0;
            String str = s.nextLine();
            for (int i=0; i<str.length(); i++){
                int answer = (str.charAt(i) == 'a')?countA++:countB++;
            }
            int minimumSteps = Math.min(countA, countB);
            System.out.println(minimumSteps);
        }
	}
}
