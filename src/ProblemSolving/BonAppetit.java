package ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BonAppetit {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int tot = 0, totHalf = 0;
        for(int i =0;i <bill.size(); i++){
            if(k != i)
                tot += bill.get(i);
        }
        totHalf = tot/2;

        if(totHalf >= b)
            System.out.println("Bon Appetit");
        else
            System.out.println(b - totHalf);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
/*
https://www.hackerrank.com/challenges/bon-appetit/problem

* 4 1
3 10 2 9
12
*
*
* 4 1
3 10 2 9
7

* */