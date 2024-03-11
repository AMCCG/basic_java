package pattren.creational.factory.method.factory;

public class PayonSlimeFactory extends SlimeFactory {

    @Override
    protected Slime buildASlime(String currentTime) {
        if (currentTime.equalsIgnoreCase("12:00")) {
            return new Poring("Poison");
        } else if (currentTime.equalsIgnoreCase("18:00")) {
            return new Angeling();
        } else {
            return new Poporing();
        }
    }
}
