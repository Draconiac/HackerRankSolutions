package ReadingTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) {

        try {
            File myObject = new File("C:\\Users\\keremy\\Desktop\\ayıkla\\testlog.txt");
            Scanner myReader = null;
            myReader = new Scanner(myObject);

            while (myReader.hasNextLine()){
                System.out.println(myReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("bok");
            e.printStackTrace();
        }
    }
}
