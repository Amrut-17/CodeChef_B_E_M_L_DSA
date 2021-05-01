package CodeChef.LunchTimeApril;

import java.util.Scanner;

public class Coldplay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while (t-->0){
            double m = s.nextDouble();
            double songLength = s.nextDouble();
            System.out.println((int)Math.floor(m/songLength));
        }
    }
}
