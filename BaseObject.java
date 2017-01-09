/**
 * Created by qny4i on 08.01.2017.
 */
public abstract class BaseObject {

    //координаты
    protected double x;
    protected double y;
    //радиус объекта
    protected double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Двигаем себя на один ход.
     */
    public abstract void move();
    /**
     * Метод рисует свой объект на "канвасе".
     */
    public abstract void draw(Canvas canvas);

    public boolean isIntersec(BaseObject o){
        double dx = x - o.x;
        double dy = y - o.y;
        double destination = Math.sqrt(dx * dx + dy * dy);
        double destination2 = Math.max(radius, o.radius);
        return destination <= destination2;
    }

    public void checkBorders(double minx, double maxx, double miny, double maxy)
    {
        if (x < minx) x = minx;
        if (x > maxx) x = maxx;
        if (y < miny) y = miny;
        if (y > maxy) y = maxy;
    }

}
