import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class VanyaAndFence {
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

        int num = sc.nextInt();
        int height=sc.nextInt();

        int sum =0;

        for(int i=0;i<num;i++)
        {
            int temp=sc.nextInt();
            if( temp <= height)
            {
                sum++;
            }
            else
            {
                sum = sum + 2;
            }
        }

        pw.print(sum);


        pw.close();
    }


}
