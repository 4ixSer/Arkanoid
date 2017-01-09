/**
 * Created by qny4i on 08.01.2017.
 */
public class Ball extends BaseObject {
    public Ball(double x, double y,double speed, double direction) {
        super(x, y, 1);
        this.speed=speed;
        this.direction=direction;
        isFrozen=true;
    }
    //скорость
    private double speed;
    //направление  (в градусах от 0 до 360)
    private double direction;
    //текущее значение вектора движения (dx,dy)
    private double dx;
    private double dy;
    //заморожен ли объект или может двигаться
    private boolean isFrozen;

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
        double angel = Math.toRadians(direction);
        dx = Math.cos(angel) * speed;
        dy = -Math.sin(angel) * speed;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    @Override
    public void move() {
        if(isFrozen) {
            setX(getX() + getDx());
            setY(getY() + getDy());
            checkRebound(1, Arcanoid.game.getWidth(), 1, Arcanoid.game.getHeight() + 5);
        }


    }
    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(getX(), getY(), 'O');
    }

    void start(){
        this.setDirection(direction);
        this.isFrozen = false;
    }

    /**
     * Проверяем не улетел ли шарик за стенку.
     * Если да - отражаем его.
     */
    public void checkRebound(int minx, int maxx, int miny, int maxy)
    {
        if (x < minx)
        {
            x = minx + (minx - x);
            dx = -dx;
        }

        if (x > maxx)
        {
            x = maxx - (x - maxx);
            dx = -dx;
        }

        if (y < miny)
        {
            y = miny + (miny - y);
            dy = -dy;
        }

        if (y > maxy)
        {
            y = maxy - (y - maxy);
            dy = -dy;
        }
    }


}
