/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int primeNumbers[] = new int[1000001];
    static boolean prime[] = new boolean[1000001];
    static int answers[] = new int[1000001];
    
    public static void main(String[] args) throws NumberFormatException,IOException {
        primeSieve();
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(answers[n]);
        }
    }
    
    public static void primeSieve(){
       for (int i=0; i<1000001; i++){
           prime[i] = true;
       }

       for (int i=2; i<=Math.sqrt(1000001); i++){
           if (prime[i] == true){
               for (int j = i*i; j<1000001; j+=i){
                   prime[j] = false;
               }
           }
       }
       primeNumbers[0] = 2;
       answers[0] = 0;
       int index = 1;
       int count = 0;
       for (int i=3; i<1000001; i++){
           if (prime[i] == true){
               primeNumbers[index] = i;
               if (primeNumbers[index] - primeNumbers[index-1] == 2){
                   count ++;
               }
               index ++;
           }
           answers[i] = count;
       }
   }
}
