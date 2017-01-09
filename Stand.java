/**
 * Created by qny4i on 08.01.2017.
 */
public class Stand extends BaseObject {
    private static int[][] matrix = {
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Stand(double x, double y) {
        super(x, y, 3);
;
    }
    //скорость
    private double speed=1;
    //направление (-1 влево, +1 вправо)
    private double direction=0;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    @Override
    public void move() {
        x+=direction*speed;
        checkBorders(radius, Arcanoid.game.getWidth() - radius + 1, 1, Arcanoid.game.getHeight() + 1);
    }
    @Override
    public void draw(Canvas canvas)
    {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'M');
    }

    void moveRight(){
        direction=1;
    }

    void moveLeft(){
        direction=-1;
    }

}
