package pattren.structural.decorator;

// Concrete Shape: Circle
public record Circle(String name) implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle, " + name() + ".");
    }
}
