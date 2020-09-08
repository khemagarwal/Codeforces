import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Games {
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

        int n = sc.nextInt();
        int count=0;
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        ArrayList<Integer> numbers1=new ArrayList<Integer>();

        for(int i=0;i<n;i++)
        {
            numbers.add(sc.nextInt());
            numbers1.add(sc.nextInt());

        }

        for(int a: numbers)
        {
            for(int b : numbers1)
            {
                if(a == b)
                {
                    count++;
                }
            }
        }

        pw.println(count);

        pw.close();
    }


}
