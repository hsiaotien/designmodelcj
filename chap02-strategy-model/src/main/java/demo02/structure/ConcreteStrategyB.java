package demo02.structure;

/**
 *  封装了具体的算法或行为，继承于Strategy
 */
public class ConcreteStrategyB extends Strategy{
    /**
     *   算法B的实现方法
     */
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法B的实现");
    }
}
