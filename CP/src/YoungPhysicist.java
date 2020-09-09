import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class YoungPhysicist {
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

        ArrayList<Integer> xcor = new ArrayList<Integer>();
        ArrayList<Integer> ycor = new ArrayList<Integer>();
        ArrayList<Integer> zcor = new ArrayList<Integer>();

        int sumX=0,sumY=0,sumZ=0;

        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            xcor.add(sc.nextInt());
            sumX=sumX+xcor.get(i);

            ycor.add(sc.nextInt());
            sumY=sumY+ycor.get(i);

            zcor.add(sc.nextInt());
            sumZ=sumZ+zcor.get(i);

        }

        if(sumX == 0 && sumY == 0 && sumZ ==0)
        {
            pw.println("YES");
        }
        else
        {
            pw.println("NO");
        }

        pw.close();
    }


}
