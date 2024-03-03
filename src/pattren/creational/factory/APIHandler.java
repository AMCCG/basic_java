package pattren.creational.factory;

public class APIHandler {

    public String callService() throws Exception {
        APIFactory apiFactory = new APIFactory();
        String result = apiFactory
                .getAPI("tiger")
                .processManual();
        return result;
    }
}
