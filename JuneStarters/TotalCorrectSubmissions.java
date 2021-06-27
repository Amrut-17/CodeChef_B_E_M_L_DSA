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
		int t = s.nextInt();
		while(t-->0){
		    int n = s.nextInt();
		    HashMap<String, Integer> map = new HashMap<>();
		    map.put(s.next(), s.nextInt());
		    for(int i=1; i<n*3; i++){
		        String str = s.next();
		        int a = s.nextInt();
		        if(map.containsKey(str)){
		            map.replace(str, map.get(str) + a);
		        }else{
		            map.put(str, a);
		        }
		    }
		    ArrayList<Integer> arr = new ArrayList<>(map.values());
		    Collections.sort(arr);
		    for(Integer it : arr){
		        System.out.print( it + " ");
		    }
		    System.out.println();
		}
	}
}
