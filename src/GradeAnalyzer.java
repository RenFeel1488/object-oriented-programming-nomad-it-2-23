import java.util.ArrayList;
import java.util.Scanner;

public class GradeAnalyzer {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grades (negative number to stop):");

        while (true) {
            int value = input.nextInt();

            if (value < 0) {
                break;
            }

            marks.add(value);
        }

        if (marks.size() == 0) {
            System.out.println("No data entered");
            input.close();
            return;
        }

        int total = 0;

        for (int i = 0; i < marks.size(); i++) {
            total += marks.get(i);
        }

        double avg = total * 1.0 / marks.size();
        System.out.println("Average: " + avg);

        int highest = marks.get(0);

        for (int i = 1; i < marks.size(); i++) {
            if (marks.get(i) > highest) {
                highest = marks.get(i);
            }
        }

        System.out.println("Max grade: " + highest);

        input.close();
    }
}