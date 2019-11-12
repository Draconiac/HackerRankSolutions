package _30DaysOfCode;
//Medium

import java.util.Date;
import java.util.Scanner;

/**
 * Asymptotic Growth
 * Asimptotik matematikte fonsiyonların limiti için kullanılan bir metottur.
 * Bu metotta f(n) gibi bir fonsiyonun n'nin çok büyük değerleri için davranışı incelenir.
 *
 * f(n) = Tetha(g(n))  f(n) ve g(n) büyüme oranı aynıdır; (Constant time (1))
 *      tek bir değeri okuma read x
 *      iki değeri karşılaştırma  a == b
 *      durum kontrol etmek isTrue
 *
 * f(n) = BigO (g(n)) g(n) herzaman f(n) den hızlı büyür
 * f(n) = bigOmega(g(n)) f(n) herzaman g(n) den hızlı büyür
 *
 */
public class Day25RunningTimeandComplexity {

}

class Solution25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your            class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        long arr[] = new long[T];

        for(int i = 0; i < T; i++){
            long start = new Date().getTime();
            System.out.print(isPrime(sc.nextLong()));
            long end =  new Date().getTime();
            System.out.println(" takes " + new Date(end-start).getTime()/1000.00 + " secs");
        }

    }

    private static String isPrime(long num){

        if(num < 2)
            return "Not prime";

        for (int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return "Not prime";
            }
        }

        return "Prime";
    }
}