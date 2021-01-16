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
            double withdraw;
            Scanner s = new Scanner(System.in);
            int withdrawalAmount = s.nextInt();
            double totalCash = s.nextDouble();

            if(withdrawalAmount % 5 == 0 && (withdrawalAmount+0.5) < totalCash){
                withdraw = totalCash - withdrawalAmount;
                totalCash = withdraw - 0.50;
                System.out.println(totalCash);
            }
            else{
                System.out.println(totalCash);
            }
        }
}
