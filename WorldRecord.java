package CodeChef;

import java.util.Scanner;

public class WorldRecord {
    public static final double record = 9.58;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while(t-->0){
            double k1 = s.nextDouble();
            double k2 = s.nextDouble();
            double k3 = s.nextDouble();
            double v = s.nextDouble();
            double answer = 100/(k1*k2*k3*v);
            double finalAnswer = (double) Math.round(answer*100) /100;
            System.out.println(finalAnswer);
            if (finalAnswer < record){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
