import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GameWithSticks {
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
        int akshat=0,malvika=0;

        while( n != 0 && m != 0 )
        {
            if(akshat == 0 && malvika == 0)
            {
                akshat++;
                n--;
                m--;
            }
            else if( akshat > malvika)
            {
                malvika++;
                n--;
                m--;
                akshat = 0;
            }
            else if( malvika > akshat)
            {
                akshat++;
                n--;
                m--;
                malvika = 0;

            }

        }

            if(malvika > akshat)
            {
                pw.println("Malvika");
            }
            else
            {
                pw.println("Akshat");
            }


        pw.close();
    }



}
