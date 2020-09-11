import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class EvenOdds {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String str = "";

        String next() {
            while (!st.hasMoreTokens())
                try {
                    str = br.readLine();
                    st = new StringTokenizer(str);
                } catch (IOException e) {
                }
            return st.nextToken();
//            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);

        long n = sc.nextLong();
        long k = sc.nextLong();

//        int median=n/2;
//
//        if(k< median)
//        {
//            pw.println(2*k-1);
//        }
//        else
//        {
//            int r=n-median;
//            if(n % 2 == 1)
//            {
//                r--;
//            }
//            pw.println(2*r);
//        }

        if(k <= (n+1)/2 )
        {
            pw.println(2*k - 1);
        }
        else
        {
            pw.println(2*(k - (n+1)/2));
        }

        pw.close();
    }


}
