package demo02;

/**
 * 继承，子类继承父类的方法（复写，复用）
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return super.getNumberA() + super.getNumberB();
    }
}
