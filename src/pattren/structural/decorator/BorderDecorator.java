package pattren.structural.decorator;

// Concrete Decorator: BorderDecorator
public class BorderDecorator extends ShapeDecorator {
    private final String color;
    private final int widthInPxs;

    public BorderDecorator(Shape decoratedShape, String color, int widthInPxs) {
        super(decoratedShape);
        this.color = color;
        this.widthInPxs = widthInPxs;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Adding " + widthInPxs + "px, " + color + " color border to " + name() + ".");
    }
}
