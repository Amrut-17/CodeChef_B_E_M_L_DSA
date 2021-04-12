package CodeChef;

import java.util.Scanner;

public class ChefAndDice {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while(t-->0){
            long answer;
            long n = s.nextLong();
            if (n==1){
                System.out.println("20");
            }else if(n==2){
                System.out.println("36");
            }else if (n==3){
                System.out.println("51");
            }else {
                long rem = n%4;
                answer = n*11;
                if(rem == 1){
                    answer += 21;
                } else if(rem == 2 || rem == 3){
                    answer += 22;
                } else{
                    answer += 16;
                }
                System.out.println(answer);
            }
        }
    }
}
