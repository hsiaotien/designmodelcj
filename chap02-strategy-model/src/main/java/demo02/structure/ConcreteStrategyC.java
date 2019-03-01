package demo02.structure;

/**
 *  封装了具体的算法或行为，继承于Strategy
 */
public class ConcreteStrategyC extends Strategy{
    /**
     *   算法C的实现方法
     */
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法C的实现");
    }
}
