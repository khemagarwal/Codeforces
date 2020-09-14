import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class IIyaAndBankAccount {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String str = "";

        String next() {
            while (!st.hasMoreTokens())
                try {
                    str = br.readLine();
                    st = new StringTokenizer(str);
                } catch (IOException e) {
                }
            return st.nextToken();
//            return str;
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

        if(num >= 0)
        {
            pw.println(num);
        }
        else
        {
            int temp=num;
           String tempp=String.valueOf(temp);
           char[] arr=tempp.toCharArray();
           String res="";
           String res1="";

           for(int i=0;i<arr.length;i++)
           {
               if(i == arr.length-1)
               {

               }
               else
               {
                   res = res.concat(String.valueOf(arr[i]));

               }

               if( i == arr.length-2)
               {

               }
               else
               {
                   res1 = res1.concat(String.valueOf(arr[i]));

               }
           }
           int re=Integer.valueOf(res);
            int re1=Integer.valueOf(res1);

            pw.println(Math.max(re,re1));

        }
        


        pw.close();
    }


}
