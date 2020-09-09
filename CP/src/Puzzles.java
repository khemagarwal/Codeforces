import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Puzzles {
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
        int m = sc.nextInt();
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        for(int i=1;i<=m;i++)
        {
            numbers.add(sc.nextInt());
        }
        Collections.sort(numbers);

        int result=99999999;

        for(int i=0;i<=m-n;i++)
        {
            result=Math.min(result,numbers.get(i+n-1)-numbers.get(i));
        }
        pw.println(result);


        pw.close();
    }


}
