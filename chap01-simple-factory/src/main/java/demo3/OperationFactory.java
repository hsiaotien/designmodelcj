package demo3;

import demo02.Operation;
import demo02.OperationAdd;
import demo02.OperationSub;

/**
 * 简单工厂模式
 * （借用demo02的部分代码）
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation oper;
        switch (operate) {
            case "+": {
                oper = new OperationAdd();
                break;
            }
            case "-": {
                oper = new OperationSub();
                break;
            }
            default: {
                oper = null;
                break;
            }
        }
        return oper;
    }
}
