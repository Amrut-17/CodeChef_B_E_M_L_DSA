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
       Codechef obj = new Codechef();
        int t= s.nextInt();
        while (t-->0){
            int base = s.nextInt();
            System.out.println(obj.numberOfTriangle(base));
        }
    }

    int numberOfTriangle(int base){
        base = (base-2);
        base = (int) Math.floorDiv(base, 2);
        return base*(base+1)/2;
    }
}
	


