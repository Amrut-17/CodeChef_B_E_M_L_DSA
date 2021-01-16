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
        while (t-->0){
            String word = s.next();
            ArrayList<Character> ar1 = new ArrayList<>();
            ArrayList<Character> ar2 = new ArrayList<>();
            int length = word.length();
            if(length%2 == 0){
                for (int i=0; i<length/2; i++){
                    ar1.add(word.charAt(i));
                }
                for (int i=length/2; i<length; i++){
                    ar2.add(word.charAt(i));
                }
                Collections.sort(ar1);
                Collections.sort(ar2);
                if (ar1.equals(ar2)){
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");

            }
            else {
                for (int i=0; i<length/2; i++){
                    ar1.add(word.charAt(i));
                }
                for (int i=length/2+1; i<length; i++){
                    ar2.add(word.charAt(i));
                }
                Collections.sort(ar1);
                Collections.sort(ar2);
                if (ar1.equals(ar2)){
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
        }
	}
}
