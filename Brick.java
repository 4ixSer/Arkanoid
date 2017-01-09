/**
 * Created by qny4i on 08.01.2017.
 */
public class Brick extends BaseObject {
    public Brick(double x, double y) {
        super(x, y, 3);
    }

    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };
    @Override
    public void move() {

    }

    @Override
    public void draw(Canvas canvas)
    {
        canvas.drawMatrix(getX() - getRadius() + 1, getY(), matrix, 'H');
    }
}
