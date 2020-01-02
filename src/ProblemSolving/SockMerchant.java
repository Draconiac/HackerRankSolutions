package ProblemSolving;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
//        List<Integer> a = Arrays.stream(ar).boxed().collect(Collectors.toList());
//
//        int noneMatchPair = 0;
//        for(int i = 0; i< a.size(); i++){
//            int iMatch = 1;
//            Object myElement = a.get(i);
//            for(int item : a){
//                if(myElement == a.get(j)){
//                    a.remove(myElement);
//                    iMatch++;
//                }
//            }
//            a.remove(myElement);
//            if(iMatch % 2 == 1)
//                noneMatchPair++;
//        }
//
//        return noneMatchPair;
        return 1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
