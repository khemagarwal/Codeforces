import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ArrivalOfTheGeneral {
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
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        int temp=0,count=0;

        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            numbers.add(sc.nextInt());

        }
        ArrayList<Integer> tempNumbers=new ArrayList<>(numbers);
        Collections.sort(tempNumbers,Collections.reverseOrder());

        int firstElement=tempNumbers.get(0);
        int lastElement=tempNumbers.get(tempNumbers.size()-1);

//        int newCount=0,tempCounter=0,tempCounter1=0;

//        for(int i=0;i<num;i++)
//        {
//            if(numbers.get(i) == firstElement && tempCounter == 0)
//            {
//                newCount=newCount + Math.abs(i-0);
//                tempCounter++;
//            }
//            if(numbers.get(i) == lastElement && tempCounter1 == 0)
//            {
//                newCount=newCount + Math.abs(i-(num-1));
//                tempCounter1++;
//            }
//        }


        //3 5
        pw.print(newCount);



//        for(int i=0;i<num-1;i++)
//        {
//            if(numbers.get(i) < numbers.get(i+1))
//            {
//                temp = numbers.get(i);
//                numbers.set(i,numbers.get(i+1));
//                numbers.set(i+1,temp);
//                count++;
//            }
//        }
//        pw.print(numbers);
//
//        pw.print(count);


        pw.close();
    }


}
