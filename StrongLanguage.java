package CodeChef;

import java.util.Scanner;

public class StrongLanguage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            long n = s.nextLong();
            long k = s.nextLong();
            long count =0;
            boolean flag = false;
            s.nextLine();
            String str = s.nextLine();
            for (int i=0; i<n; i++){
                if (str.charAt(i) == '*'){
                    count += 1;
                }else {
                    if (count >= k){
                        flag = true;
                        break;
                    }
                    count = 0;
                }
            }
            if (flag){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
