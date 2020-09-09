import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class AntonAndLetters {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String str="";

        String next() {
            while (!st.hasMoreTokens())
                try {
                    str=br.readLine();
                    st = new StringTokenizer(str);
                } catch (IOException e) {
                }
//            return st.nextToken();
            return str;
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

//        pw.println(str);



        if(str.charAt(1) == '}')
        {
            pw.println(0);
        }
        else
        {
            HashSet<Character> hs=new HashSet<Character>();

            for(int i=1;i<=str.length()-1;i+=3)
            {
                hs.add(str.charAt(i));
            }
            pw.println(hs.size());
        }

        pw.close();
    }


}
