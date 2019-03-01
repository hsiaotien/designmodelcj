package demo03;

import demo01.*;

/**
 * 策略与简单工厂结合， 简单工厂不仅仅有chap01中的一种表现形式
 */
public class CashContext {
    CashSuper cs = null;


    public CashContext(CashType type) {
        // 将实例化具体策略的过程由客户端转移到Context类中，简单工厂的应用。

        // 与之前的简单工厂模式比较，后者客户端需要接触CashSuper 和 CashFactory。
        // 而策略与简单工厂结合，客户端只需要接触一个类CashContext就可以了，耦合更加降低
        switch (type) {
            case NORMAL: {
                cs = new CashNormal();
                break;
            }
            case RETURN: {
                cs = new CashReturn(300,100);
                break;
            }
            case REBATE: {
                cs = new CashRebate(0.8);
                break;
            }
            default: {
                throw new RuntimeException("不支持此算法");
            }
        }
    }

    public double getResult(double money) {
        return cs.acceptCash(1000);
    }
}
