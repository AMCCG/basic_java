package pattren.creational.factory;

public class APIFactory {

    public <T> IAppSpaceAction getAPI(String key) throws Exception {
        IAppSpaceAction appSpaceAction = null;
        if (key.equalsIgnoreCase("tiger")) {
            appSpaceAction = new Tiger();
        } else if (key.equalsIgnoreCase("lion")) {
            appSpaceAction = new Lion();
        } else {
            throw new Exception("key not match");
        }
        return appSpaceAction;
    }
}
