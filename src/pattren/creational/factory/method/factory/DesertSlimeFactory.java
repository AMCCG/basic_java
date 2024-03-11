package pattren.creational.factory.method.factory;

public class DesertSlimeFactory extends SlimeFactory {
    @Override
    protected Slime buildASlime(String currentTime) {
        if (currentTime.equalsIgnoreCase("12:00")) {
            return new Drops("Fire");
        } else if (currentTime.equalsIgnoreCase("19:00")) {
            return new Ghosting();
        } else {
            return new Poporing();
        }
    }
}
