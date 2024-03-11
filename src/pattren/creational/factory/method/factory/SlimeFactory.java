package pattren.creational.factory.method.factory;

public abstract class SlimeFactory {
    public Slime createNewSlime(String currentTime) {
        return buildASlime(currentTime);
    }

    protected abstract Slime buildASlime(String currentTime);

}
