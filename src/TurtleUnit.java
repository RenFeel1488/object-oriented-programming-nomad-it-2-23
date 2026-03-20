public class TurtleUnit {

    private int posX;
    private int posY;
    private int dir;

    public TurtleUnit(int posX, int posY, int dir) {
        this.posX = posX;
        this.posY = posY;
        this.dir = dir;
    }

    public void move(int limit) {

        int nextX = posX;
        int nextY = posY;

        switch (dir) {
            case 0:
                nextX--;
                break;
            case 1:
                nextY++;
                break;
            case 2:
                nextX++;
                break;
            case 3:
                nextY--;
                break;
        }

        if (nextX >= 0 && nextX < limit && nextY >= 0 && nextY < limit) {
            posX = nextX;
            posY = nextY;
        } else {
            System.out.println("Out of bounds!");
        }
    }

    public void rotateRight() {
        dir = (dir + 1) % 4;
        System.out.println("Turned right");
    }

    public void rotateLeft() {
        dir = (dir + 3) % 4;
        System.out.println("Turned left");
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }
}

// это вторая черепашка переделка как надо