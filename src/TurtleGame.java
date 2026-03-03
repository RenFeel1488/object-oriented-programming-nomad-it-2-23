import java.util.Random;
import java.util.Scanner;

public class TurtleGame {

    static final int SIZE = 5;

    static int x;
    static int y;
    static int direction;

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        x = random.nextInt(SIZE);
        y = random.nextInt(SIZE);

        direction = random.nextInt(4);

        System.out.println("Черепашка появилась!");
        printField();

        while (true) {

            System.out.println("1 - вперед | 2 - вправо | 3 - влево | 0 - выход");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Игра завершена.");
                break;
            }

            if (choice == 1) {
                moveForward();
            } else if (choice == 2) {
                turnRight();
            } else if (choice == 3) {
                turnLeft();
            }

            printField();
        }

        scanner.close();
    }

    static void moveForward() {
        int newX = x;
        int newY = y;

        if (direction == 0) newX--;
        if (direction == 1) newY++;
        if (direction == 2) newX++;
        if (direction == 3) newY--;

        if (newX < 0 || newX >= SIZE || newY < 0 || newY >= SIZE) {
            System.out.println("Туда нельзя! Граница поля!");
        } else {
            x = newX;
            y = newY;
        }
    }

    static void turnRight() {
        direction = (direction + 1) % 4;
        System.out.println("Поворот направо");
    }

    static void turnLeft() {
        direction = (direction + 3) % 4;
        System.out.println("Поворот налево");
    }

    static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == x && j == y) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}