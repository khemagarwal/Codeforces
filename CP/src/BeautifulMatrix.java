import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BeautifulMatrix {
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

//        int num = sc.nextInt();
        int [][]matrix=new int[6][6];

        for(int j=1;j<=5;j++)
        {
            for(int i=1;i<=5;i++)
            {
                matrix[j][i]=sc.nextInt();
                if(matrix[j][i] == 1)
                {
                    pw.print(Math.abs(j-3)+Math.abs(i-3));
                }

            }
        }
  


        pw.close();
    }


}
