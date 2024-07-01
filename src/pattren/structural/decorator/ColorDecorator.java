package pattren.structural.decorator;

public class ColorDecorator extends ShapeDecorator {
    private final String color;

    public ColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Filling with " + color + " color to " + name() + ".");
    }
}
