package demo02.structure;

public class Client {

    public static void main(String[] args) {
        Context context;
        // 由于实例化不同的策略，syi当最终调用context.contextInterface()时，所获得的结果不尽相同
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        //
        //...
    }
}
