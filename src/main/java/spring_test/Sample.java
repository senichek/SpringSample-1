package spring_test;

public class Sample {

    private static int constructorCounter = 0;
    private int counter = 0;

    public Sample() {
        constructorCounter++;
    }

    public int getConstructorCounter() {
        return constructorCounter;
    }

    public int getCounter() {
        return ++counter;
    }
}
