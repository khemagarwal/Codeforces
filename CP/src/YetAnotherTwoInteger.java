import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class YetAnotherTwoInteger {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
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

        int tc = sc.nextInt();
        for(int i=0;i<tc;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;

            if( a == b)
            {
                count=0;
            }
            else
            {
                int temp= Math.abs(a-b);

                for(int j=10;j>=1;j--)
                {
                int rr = temp/j;
                temp=temp-(rr*j);
                count=count+rr;
                }

                //
//                for(int j=10;j>=1;j--)
//                {
//                    while (temp >=i)
//                    {
//                        temp=temp-j;
//                        count++;
//                    }
//
//
//                }

            }
            pw.println(count);

        }


        pw.close();
    }


}
