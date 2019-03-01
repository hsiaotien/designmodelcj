package demo02.structure;

/**
 * 上下文.  (UML中的聚合关系）
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.AlgorithmInterface();
    }
}
