/**
 * Created by qny4i on 08.01.2017.
 */
public class Canvas {

    //ширина и высота
    private int width;
    private int height;
    //матрица, где рисуем. символ - это цвет.
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        this.matrix = new char[height + 2][width + 2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public void setPoint(double x, double y, char c){
        int xNew = (int) Math.round(x);
        int yNew = (int) Math.round(y);
        if (yNew < 0 || yNew >= matrix.length) return;
        if (xNew < 0 || xNew >= matrix[yNew].length) return;

        matrix[yNew][xNew] = c;
    }

    public void drawMatrix(double x, double y, int[][] matrix, char c){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]== 1){                //ТУТУ В МОЖЕТ 1
                    setPoint(x+j,y+i,c);
                }
            }
        }
    }

    public void clear()
    {
        this.matrix = new char[height + 2][width + 2];
    } //не понял почему

    public void print()
    {
        System.out.println();

        for (int i = 0; i < height + 2; i++)
        {
            for (int j = 0; j < width + 2; j++)
            {
                System.out.print(" ");
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println();
    }

}
