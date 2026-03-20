import java.util.ArrayList;

public class TaskManager {

    public static void main(String[] args) {

        ArrayList<String> todoList = new ArrayList<>();

        todoList.add("Buy bread");
        todoList.add("Clean room");
        todoList.add("Study programming");

        System.out.println("Total tasks: " + todoList.size());

        todoList.remove(1);

        todoList.set(0, "Buy fresh bread");

        System.out.println("Updated tasks:");

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }
    }
}