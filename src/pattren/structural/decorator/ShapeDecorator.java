package pattren.structural.decorator;

// Abstract Decorator Class
abstract class ShapeDecorator implements Shape {
    private final Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public String name() {
        return decoratedShape.name();
    }
}
