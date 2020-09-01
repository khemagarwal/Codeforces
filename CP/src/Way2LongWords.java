import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Way2LongWords {
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

        for(int i=0;i<num;i++)
        {
            String temp=sc.next();

            if(temp.length() > 10)
            {
                char start=temp.charAt(0);
                char end=temp.charAt(temp.length()-1);

//                pw.println();

                pw.println(String.valueOf(start).concat(String.valueOf(temp.length()-2).concat(String.valueOf(end))));
            }
            else
            {
                pw.println(temp);
            }
        }


        pw.close();
    }


}
