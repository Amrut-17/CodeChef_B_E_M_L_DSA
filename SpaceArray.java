package CodeChef;

import java.util.Arrays;
import java.util.Scanner;

public class SpaceArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while (t-->0){
            int count = 0;
            int flag =0;
            long n = s.nextLong();
            int[]  arr = new int[(int) n];
            for (int i=0; i<n; i++){
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            for (int i=0; i<n; i++){
                if (arr[i] > i+1){
                    flag = 1;
                    break;
                }else if(arr[i]<i+1){
                    count +=  Math.abs((arr[i]-(i+1)));
                }
            }
            if (flag == 1) {
                System.out.println("Second");
                break;
            }else if (count % 2 == 0){
                System.out.println("Second");
            }else {
                System.out.println("First");
            }


        }
    }
}
