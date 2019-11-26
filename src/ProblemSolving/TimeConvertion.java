package ProblemSolving;

import java.io.IOException;
import java.util.Scanner;

public class TimeConvertion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        String[] clck = s.split(":");
        String c = "";
        if(clck[2].substring(2,4).equals("PM")){

            c = (clck[0].equals("12") ? clck[0] : (Integer.valueOf(clck[0])+12) )+":"+clck[1]+":"+clck[2].substring(0,2);

        }else{
            if(clck[0].equals("12")){
                c = "00:"+clck[1]+":"+clck[2].substring(0,2);
            }else {
                c = (clck[0] + ":" + clck[1] + ":" + clck[2].substring(0, 2));
            }
        }

        return c;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scan.nextLine();

        System.out.println(timeConversion("12:45:54PM"));

//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }
}
