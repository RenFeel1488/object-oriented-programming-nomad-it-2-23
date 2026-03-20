import java.util.ArrayList;
import java.util.Random;

public class NumberFilter {

    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            values.add(rnd.nextInt(50) + 1);
        }

        System.out.println("Original list:");
        System.out.println(values);

        int index = 0;
        while (index < values.size()) {

            if (values.get(index) % 2 == 1) {
                values.remove(index);
            } else {
                index++;
            }
        }

        System.out.println("Filtered list:");
        System.out.println(values);
    }
}