package _30DaysOfCode;

import java.util.Scanner;

public class Day26NestedLogic {}

class Solution26{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] returnDate = sc.nextLine().split(" ");
        String[] expectedDate = sc.nextLine().split(" ");
        sc.close();
        int day = Integer.parseInt(expectedDate[0]) - Integer.parseInt(returnDate[0]);
        int month = Integer.parseInt(expectedDate[1]) - Integer.parseInt(returnDate[1]);
        int year = Integer.parseInt(expectedDate[2]) - Integer.parseInt(returnDate[2]);

        if (year > 0 || (year == 0 && month > 0) || (year == 0 && month == 0 && day > 0)) {
            System.out.println("0");
        } else if (day < 0 && month == 0 && year == 0) {
            System.out.println(15 * (day * -1));
        } else if (month < 0 && year == 0) {
            System.out.println(500 * (month * -1));
        } else if (year < 0) {
            System.out.println("10000");
        }
    }
}
/*

31 12 2009
1 1 2010


31 8 2004
20 1 2004
3500
-------
8 4 12
1 1 1
10000
-----
*/