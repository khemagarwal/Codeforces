import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Div2668B {
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

        ArrayList<Integer> numbers=new ArrayList<Integer>();
        int tc = sc.nextInt();

        for(int i=0;i<tc;i++)
        {
            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                numbers.add(sc.nextInt());

            }

            for(int j=0;j<numbers.size()-1;j++)
            {
                for(int k=j+1;k<numbers.size();k++)
                {
                    if(numbers.get(j) > 0 && numbers.get(k) < 0 )
                    {


                    }
                }


            }

        }


        pw.close();
    }


}
