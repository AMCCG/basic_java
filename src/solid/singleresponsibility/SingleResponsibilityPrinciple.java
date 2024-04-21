package solid.singleresponsibility;

import solid.singleresponsibility.rectangle.Rectangle;

public class SingleResponsibilityPrinciple {

    public static void main(String[] args) {
        System.out.println("Single-Responsibility principle");
        rectangle();
    }

    private static void rectangle() {
        Rectangle teamGraphic = new Rectangle();
        Rectangle teamGeometry = new Rectangle();
        teamGraphic.draw();
        teamGraphic.getArea();
        teamGeometry.getArea();

        solid.singleresponsibility.rectangle.refactor.Rectangle teamGraphicNew = new solid.singleresponsibility.rectangle.refactor.Rectangle();
        solid.singleresponsibility.rectangle.refactor.GeometricRectangle teamGeometryNew = new solid.singleresponsibility.rectangle.refactor.GeometricRectangle();
        teamGraphicNew.draw();
        teamGraphicNew.getArea();
        teamGeometryNew.getArea();
    }
}
