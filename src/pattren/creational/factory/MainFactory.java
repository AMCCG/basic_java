package pattren.creational.factory;

import pattren.creational.factory.animal.AnimalHandler;
import pattren.creational.factory.method.factory.DesertSlimeFactory;
import pattren.creational.factory.method.factory.PayonSlimeFactory;
import pattren.creational.factory.method.factory.Slime;
import pattren.creational.factory.method.factory.SlimeFactory;

import java.util.List;

public class MainFactory {

    public static void main(String[] args) {
        System.out.println("Factory");
        System.out.println("*********************************");
        animal(List.of("tiger", "lion"));
        System.out.println("*********************************");
        methodFactory(List.of("12:00", "18:00"));
        System.out.println("*********************************");
    }

    public static void animal(List<String> animals) {
        AnimalHandler handler = new AnimalHandler();
        for (String animal : animals) {
            System.out.println(handler.create(animal));
        }
    }

    private static void methodFactory(List<String> currentTimes) {
        for (String currentTime : currentTimes) {
            SlimeFactory payonSlimeFactory = new PayonSlimeFactory();
            SlimeFactory desertSlimeFactory = new DesertSlimeFactory();

            Slime dSlime = desertSlimeFactory.createNewSlime(currentTime);
            System.out.println(dSlime.getName());

            Slime pSlime = payonSlimeFactory.createNewSlime(currentTime);
            System.out.println(pSlime.getName());
        }
    }

}
