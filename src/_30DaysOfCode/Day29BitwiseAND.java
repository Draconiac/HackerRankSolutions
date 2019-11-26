package _30DaysOfCode;

import java.util.LinkedList;
import java.util.Scanner;

public class Day29BitwiseAND {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            LinkedList<Integer> arr = new LinkedList<Integer>();
            for (int i = 1; i < n; i++){
                for (int j = i+1; j <= n; j++){
                    if((i & j) < k) {
                        arr.add(i & j);
                    }
                }
            }

            int max = -1;
            for (Integer a : arr){
                if(a.intValue() > max)
                    max = a.intValue();
            }

        }

        scanner.close();
    }
}



/*
3
5 2
8 5
2 2

1
4
0

 */