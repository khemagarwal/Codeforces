import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;



public class Watermelon {

    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {}
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
            FastScanner fs=new FastScanner();
            PrintWriter pw=new PrintWriter(System.out);


            int num=fs.nextInt();

            if( num % 2 != 0 || num == 2)
            {
                pw.print("NO");
            }
            else
            {
                pw.print("YES");
            }

        pw.close();
        }
    }


