package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marbles {

    public static long nCr(int n,int r)
    {
        long ans =1;
        if(r> n-r)
            r = n-r;
        if(r==1)
            return n;
        if(r==0)
            return 1;
        for(int i=1;i<=r;i++)
        {
            ans *= (n-i+1);
            ans /= i;
        }
        return ans;
    }

    public static long noOfMarbles(int n,int k)
    {
        int N = n-k;
        if(N==0)
            return 1;
        else
            return nCr(N+k-1,N);
    }

    public static void main(String[]  args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        while (t-->0){
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            System.out.println(noOfMarbles(n,k));
        }
    }
}
