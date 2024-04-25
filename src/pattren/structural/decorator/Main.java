package pattren.structural.decorator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Decorator pattern");
        // Create a circle
        Shape circle1 = new Circle("circle1");
        // Decorate the circle with a border
        Shape circle1WithBorder = new BorderDecorator(circle1, "red", 2);
        // Decorate the circle with a color
        Shape circle1WithBorderAndColor = new ColorDecorator(circle1WithBorder, "blue");

        // Draw the decorated circle
        circle1WithBorderAndColor.draw();

        // output
        // Drawing circle, circle1.
        // Adding 2px, red color border to circle1.
        // Filling with blue color to circle1.

    }
}
