import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Square> squares = new ArrayList<>();
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();

        Square square1 = new Square(4);
        Square square2 = new Square(4);
        Square square3 = new Square(4);
        Square square4 = new Square(4);

        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(4,5);
        Rectangle rectangle3 = new Rectangle(4,5);
        Rectangle rectangle4 = new Rectangle(4,5);

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(2);
        Circle circle4 = new Circle(2);

        squares.add(square1);
        squares.add(square2);
        squares.add(square3);
        squares.add(square4);

        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);
        rectangles.add(rectangle4);

        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        circles.add(circle4);

        System.out.println("All squares area " + FindArea.findSquareArea(squares));
        System.out.println("All rectangles area " + FindArea.findRectangleArea(rectangles));
        System.out.println("All circles area " + FindArea.findCircleArea(circles));
    }
}
