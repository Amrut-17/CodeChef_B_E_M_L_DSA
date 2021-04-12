package CodeChef;
import java.io.IOException;
import java.util.Scanner;

public class ValidPair {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();
        if(a==b || a==c || b==c ){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
