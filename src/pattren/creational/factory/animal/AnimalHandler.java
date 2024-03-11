package pattren.creational.factory.animal;

public class AnimalHandler {

    public String create(String type) {
        AnimalFactory apiFactory = new AnimalFactory();
        return apiFactory.getAnimal(type).roar();
    }
}
