package CodeChef.LunchTimeApril;

import java.util.Scanner;

public class Equinox {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            long a = s.nextLong();
            long b = s.nextLong();
            s.nextLine();
            int sarthaksCount =0;
            int anuradhasCount =0;
            String word = "EQUINOX";
            for (int i=0; i<n; i++){
                String str = s.nextLine();
                String changeToUpperCase = str.toUpperCase();
                if (word.contains(String.valueOf(changeToUpperCase.charAt(0)))){
                    sarthaksCount +=a;
                }else {
                    anuradhasCount+=b;
                }
            }
            if (sarthaksCount>anuradhasCount){
                System.out.println("SARTHAK");
            }else if(sarthaksCount==anuradhasCount){
                System.out.println("DRAW");
            }else {
                System.out.println("ANURADHA");
            }
        }
    }
}
