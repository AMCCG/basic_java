package pattren.creational.factory.calculator;

public interface OperationFactory {
    Operation getInstance(int choice) throws InvalidOperationException;
}
