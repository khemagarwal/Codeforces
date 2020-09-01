import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Twins {
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
        ArrayList<Integer> coins=new ArrayList<Integer>();

        int num = sc.nextInt();
        int sum=0,total=0,count=0;
        for(int i=0;i<num;i++)
        {
            coins.add(sc.nextInt());
            total=total+ coins.get(i);

        }
        Collections.sort(coins,Collections.reverseOrder());
//        pw.println(coins);
        for(int i=0;i<coins.size();i++)
        {
            count++;
            sum=sum+coins.get(i);

            int brother=total-sum;
            if(sum > brother)
            {
                pw.println(count);
                break;
            }

        }


        pw.close();
    }


}
