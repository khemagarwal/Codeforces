import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ChatRoom {
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

        String str = sc.next();

        int countH=0,countE=0,countL=0,countO=0;

        for(int i=0;i<str.length();i++)
        {
            char temp=str.charAt(i);
            if(temp == 'h')
            {
                countH++;
            }

            if(temp == 'e' && countH > 0)
            {
                countE++;
            }

            if(temp == 'l' && countE > 0)
            {
                countL++;
            }

            if(temp == 'o' && countL >= 2)
            {
                countO++;
            }


        }

        if(countO > 0)
        {
            pw.print("YES");
        }
        else
        {
            pw.print("NO");
        }


        pw.close();
    }


}
