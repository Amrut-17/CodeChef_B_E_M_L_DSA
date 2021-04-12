package CodeChef;

import java.util.Scanner;

public class WorthyMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while(t-->0){
            long n = s.nextLong();
            long m = s.nextLong();
            long k = s.nextLong();
            long[][] mat = new long[(int) (n+1)][(int) (m+1)];
            for (int i=0; i<=n; i++){
                for (int j=0; j<=m; j++){
                    if(i==0 || j==0){
                        mat[i][j]=0;
                    }else {
                        mat[i][j] = s.nextInt();
                    }
                }
            }
            for(int i=0;i<=n;i++){
                long pre=0;
                for(int j=0;j<=m;j++){
                    mat[i][j]+=pre;
                    pre=mat[i][j];
                }
            }
            for(int j=0;j<=m;j++){
                long pre=0;
                for(int i=0;i<=n;i++){
                    mat[i][j]+=pre;
                    pre=mat[i][j];
                }
            }

            long big=Math.min(n,m);
            long answer = 0;
            for(int len=1;len<=big;len++){
                for(int i=len;i<=n;i++){
                    for(int j=len;j<=m;j++){
                        if((mat[i][j]+mat[i-len][j-len]-mat[i][j-len]-mat[i-len][j])/((long) len *len)>=k){
                            answer++;
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
