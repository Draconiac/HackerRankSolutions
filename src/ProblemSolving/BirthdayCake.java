package ProblemSolving;

import java.util.Scanner;

public class BirthdayCake {

    static int birthdayCakeCandles(int[] ar) {

        int max = 0, c = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] > max){
                max = ar[i];
                c = 0;
            }
            if (max == ar[i]){
                c++;
            }
        }
        return c;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);
        System.out.println(result);
        scanner.close();
    }
}
