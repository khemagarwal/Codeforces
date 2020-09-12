import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Div2670A {
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

        int tc = sc.nextInt();
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        ArrayList<Integer> numbers2=new ArrayList<Integer>();

        for(int i=0;i<tc;i++)
        {
            int count1=0,count2=0,tempcount=0,tempcount1=0;

            int n=sc.nextInt();
            for(int j=0;j<n;j++)
            {

                int temp=sc.nextInt();
                if(numbers.contains(temp))
                {
                    numbers2.add(temp);
                }
                else
                {
                    numbers.add(temp);
                }

            }

            if(numbers.isEmpty())
            {
                count1=0;
            }
            else
            {
                HashSet<Integer> aa=new HashSet<>(numbers);

                ArrayList<Integer> bb =new ArrayList<Integer>(aa);
                Collections.sort(bb);

                for(int k=0;k<bb.size();k++)
                {
                    if(bb.get(k) == k)
                    {
                        tempcount++;
                    }
                    else {
                        count1 = k;
                        break;
                    }

                }
                if(tempcount == bb.size())
                {
                    if(bb.get(bb.size()-1) < 0)
                    {
                        count1=0;
                    }
                    else
                    {
                        count1=bb.get(bb.size()-1) + 1;

                    }
                }
            }
            if(numbers2.isEmpty())
            {
                count2=0;
            }
            else
            {

                HashSet<Integer> cc=new HashSet<>(numbers2);

                ArrayList<Integer> dd =new ArrayList<Integer>(cc);
                Collections.sort(dd);
                for(int k=0;k<dd.size();k++)
                {
                    if(dd.get(k) == k)
                    {
                        tempcount1++;
                    }
                    else {
                        count2 = k;
                        break;
                    }

                }
                if(tempcount1 == dd.size())
                {
                    if(dd.get(dd.size()-1) < 0)
                    {
                        count2=0;
                    }
                    else
                    {
                        count2=dd.get(dd.size()-1) + 1;

                    }

                }

            }
            pw.println(count1+count2);

            numbers.clear();
            numbers2.clear();


        }

        pw.close();
    }


}
