package ProblemSolving;

import javax.xml.transform.Result;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GradingStudents {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = gradingStudents(grades);
        System.out.println(result);
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }


    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> calculatedGrades = new ArrayList();
        for (Integer grade : grades) {
            if (grade >= 38) {
                int multiple5grade = grade + (5 - (grade % 5));
                if (multiple5grade - grade < 3) {
                    calculatedGrades.add(multiple5grade);
                } else {
                    calculatedGrades.add(grade);
                }
            } else {
                calculatedGrades.add(grade);
            }
        }
        return calculatedGrades;
    }

}
