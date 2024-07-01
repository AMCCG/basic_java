package pattren.creational.factory.animal;

public class AnimalFactory {

    public Animal getAnimal(String type) throws IllegalArgumentException {
        return switch (type) {
            case "tiger" -> new Tiger();
            case "lion" -> new Lion();
            default -> throw new IllegalArgumentException("Type not match!");
        };
    }
}
