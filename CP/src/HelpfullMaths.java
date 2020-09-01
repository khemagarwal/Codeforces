import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class HelpfullMaths {
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
        ArrayList<Character> numbers=new ArrayList<>();

        String str = sc.next();
        String result="";

        if(str.length() == 1)
        {
            result =str;
        }
        else
        {

            for(int i =0;i<str.length();i=i+2)
            {
                char temp=str.charAt(i);
//                pw.println(temp);
                numbers.add(temp);
            }
            Collections.sort(numbers);

//            pw.print(numbers);

            for (int i=0;i<numbers.size();i++)
            {
                if(i == numbers.size()-1)
                {
                    result=result.concat(String.valueOf(numbers.get(i)));

                }
                else
                {
                    result=result.concat(String.valueOf(numbers.get(i))+"+");

                }

            }
        }

        pw.print(result);


        pw.close();
    }


}
