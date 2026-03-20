import java.util.ArrayList;
import java.util.Scanner;

public class BookSearchApp {

    public static void main(String[] args) {

        ArrayList<BookEntry> library = new ArrayList<>();

        library.add(new BookEntry("The Silent Forest", "Emily Carter"));
        library.add(new BookEntry("Beyond the Horizon", "Lucas Miller"));
        library.add(new BookEntry("Digital Dreams", "Sophia Zhang"));
        library.add(new BookEntry("Ocean's Whisper", "Mason Brooks"));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter author's name: ");
        String authorInput = scanner.nextLine();

        System.out.println("Books by " + authorInput + ":");

        boolean isFound = false;

        for (BookEntry b : library) {
            if (b.getAuthor().equalsIgnoreCase(authorInput)) {
                System.out.println(b.getTitle());
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("No books found for this author.");
        }

        scanner.close();
    }
}
