import java.util.Random;
import java.util.Scanner;

public class GameController {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        Grid grid = new Grid(5);

        TurtleUnit t = new TurtleUnit(
                rnd.nextInt(grid.getDimension()),
                rnd.nextInt(grid.getDimension()),
                rnd.nextInt(4)
        );

        System.out.println("Turtle spawned on the field");
        grid.display(t);

        while (true) {

            System.out.println("1 - move | 2 - turn right | 3 - turn left | 0 - quit");
            int command = input.nextInt();

            if (command == 0) {
                System.out.println("Game over");
                break;
            }

            switch (command) {
                case 1:
                    t.move(grid.getDimension());
                    break;
                case 2:
                    t.rotateRight();
                    break;
                case 3:
                    t.rotateLeft();
                    break;
                default:
                    System.out.println("Unknown command");
            }

            grid.display(t);
        }

        input.close();
    }
}