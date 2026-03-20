public class Grid {

    private int dimension;

    public Grid(int dimension) {
        this.dimension = dimension;
    }

    public void display(TurtleUnit t) {

        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {

                if (row == t.getX() && col == t.getY()) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }

            }
            System.out.println();
        }

        System.out.println();
    }

    public int getDimension() {
        return dimension;
    }
}