package CodeChef.LunchTimeApril;

import java.util.Scanner;

public class ChefInHeaven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while (t-->0){
            long l = s.nextLong();
            s.nextLine();
            String str = s.nextLine();
            long zeros =0;
            long ones = 0;
            boolean flag = false;
            for (int i=0; i<l; i++){
                if (str.charAt(i) == '0'){
                    zeros++;
                }else {
                    ones++;
                }
                if (ones>=zeros){
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
