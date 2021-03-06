package demo02;

/**
 * 紧耦合 vs 松耦合
 */
public abstract class Operation {
    private double numberA = 0d;
    private double numberB = 0d;

    // get result
    public abstract double getResult();


    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
