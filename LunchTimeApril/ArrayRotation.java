package CodeChef.LunchTimeApril;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        final long mod = 1000000007;
        long total =0;
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        for (int i=0; i<n; i++){
            long a = s.nextLong();
            total=(total+a+mod)%mod;
        }
        long q= s.nextLong();
        for (int j=0; j<q; j++){
            total=(2*total)%mod;
            System.out.println(total);
        }

    }
}
