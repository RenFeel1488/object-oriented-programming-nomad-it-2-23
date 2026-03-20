import java.util.ArrayList;
import java.util.Collections;

public class ContactMerger {

    public static void main(String[] args) {

        ArrayList<String> phoneContacts = new ArrayList<>();
        phoneContacts.add("Вупсень");
        phoneContacts.add("Пупсень");
        phoneContacts.add("Лунтик");

        ArrayList<String> simContacts = new ArrayList<>();
        simContacts.add("Пчелёнок");
        simContacts.add("Мила");
        simContacts.add("Кузя");
        simContacts.add("Лунтик");
        // второй лунтик чтобы проверить копии

        ArrayList<String> mergedContacts = new ArrayList<>();

        for (String c : phoneContacts) {
            if (!mergedContacts.contains(c)) {
                mergedContacts.add(c);
            }
        }

        for (String c : simContacts) {
            if (!mergedContacts.contains(c)) {
                mergedContacts.add(c);
            }
        }

        Collections.sort(mergedContacts);

        System.out.println("Merged contacts:");
        for (String c : mergedContacts) {
            System.out.println(c);
        }
    }
}