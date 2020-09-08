import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Div2699A {

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
        ArrayList<Integer> numbers=new ArrayList<Integer>();


        for(int i=0;i<tc;i++)
        {
            int sumEven=0,sumOdd=0;

            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {
                numbers.add(sc.nextInt());
                if(j % 2 == 0)
                {
                    sumEven=sumEven + numbers.get(j);
                }
                else
                {
                    sumOdd=sumOdd + numbers.get(j);
                }
            }

//            int diff=Math.abs(sumEven-sumOdd);

            if( sumEven != sumOdd)
            {
                for(int z=0;z<n;z+=2)
                {
                    numbers.remove(z);

                }
            }



//            while (diff !=0)
//            {
//                int k=0;
//                if(sumEven > sumOdd)
//                {
//                    k=0;
//                }
//                else
//                {
//                    k=1;
//                }
//                if(numbers.get(k) == 1)
//                {
//                    numbers.remove(k);
//                    diff--;
//                }
//                k=k+2;
//            }
            pw.println(numbers.size());
            for(int y=0;y<numbers.size();y++)
            {
                pw.print(numbers.get(y)+" ");

            }

            pw.println("");


            numbers.clear();

        }


        pw.close();
    }



}
