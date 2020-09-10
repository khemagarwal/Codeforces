import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CheapTravel {
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

        int n= sc.nextInt();
        int m= sc.nextInt();
        int a= sc.nextInt();
        int b= sc.nextInt();



        if (m * a <= b)
            pw.println(n * a);
        else
            pw.println((n/m) * b + Math.min((n%m) * a, b));


//        int quo=n/m;
//        int rem=n%m;

//        int res1=Math.min(((quo * b) + (rem * a)),((quo * b) + (rem * b)));

//        int res2=Math.min(res1,((quo * a) + (rem * a)));

//        if(m > n)
//        {
//            pw.println(b);
//        }
//        else
//        {
//            pw.println(res1);
//        }



        pw.close();
    }


}
