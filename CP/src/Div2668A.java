import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Div2668A {
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
        ArrayList<Integer> per=new ArrayList<Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();

        for(int i=0;i<tc;i++)
        {
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {

                per.add(sc.nextInt());
            }
//            for(int k=0;k<per.size()-1;k++)
//            {
//                int sum = per.get(k) + per.get(k+1);
//                result.add(sum);
//
//            }
            Collections.reverse(per);
            for(Integer a : per)
            {
                pw.print(a+" ");
            }
            pw.println();

            per.clear();

        }



        pw.close();
    }


}
