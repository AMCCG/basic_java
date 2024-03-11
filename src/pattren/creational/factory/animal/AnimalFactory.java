package pattren.creational.factory.animal;

public class AnimalFactory {

    public Animal getAnimal(String type) throws IllegalArgumentException {
        Animal animal;
        switch (type) {
            case "tiger":
                animal = new Tiger();
                break;
            case "lion":
                animal = new Lion();
                break;
            default:
                throw new IllegalArgumentException("Type not match!");
        }
        return animal;
    }
}
