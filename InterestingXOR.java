package CodeChef;

import java.util.Scanner;

public class InterestingXOR {
    public static void main(String[]  args){
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while (t-->0){
            long c = s.nextLong();
            long temp = c;
            long count = 0;
            while (temp>0){
                temp = temp/2;
                count += 1;
            }
            long a = (long) (Math.pow(2,count-1)-1);
            long b = a^c;
            long answer = a*b;
            System.out.println(answer);
        }
    }
}
