import java.util.ArrayList;


public class FindArea {
    public static int findSquareArea(ArrayList<Square> squares){
        //s=a*a;
        //int s = square.getSideLength() * square.getSideLength();
        int[] s = new int[squares.size()];
        for (int i = 0; i < squares.size(); i++) {
            s[i] = squares.get(i).getSideLength() * squares.get(i).getSideLength();
        }

        int allSquereArea = 0;

        for (int i = 0; i < s.length; i++) {
            allSquereArea = allSquereArea + s[i];
        }
        return allSquereArea;
    }

    public static int findRectangleArea(ArrayList<Rectangle> rectangles){
        int[] s = new int[rectangles.size()];
        for (int i = 0; i < rectangles.size(); i++) {
            s[i] = rectangles.get(i).getHeight() * rectangles.get(i).getWidth();
        }
        int allRectangleArea = 0;

        for (int i = 0; i < s.length; i++) {
            allRectangleArea = allRectangleArea + s[i];
        }
        return allRectangleArea;
    }

    public static int findCircleArea(ArrayList<Circle> circles){
        int[] s = new int[circles.size()];
        final double PI = 3.14;
        for (int i = 0; i < circles.size(); i++) {
            s[i] = (int) ((circles.get(i).getRadius() * circles.get(i).getRadius()) * PI);
        }
        int allCirclesArea = 0;

        for (int i = 0; i < s.length; i++) {
            allCirclesArea = allCirclesArea + s[i];
        }
        return allCirclesArea;

    }
}
