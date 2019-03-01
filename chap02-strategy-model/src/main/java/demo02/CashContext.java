package demo02;

import demo01.CashSuper;

/**
 * 上下文
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    /**
     * 根据收费策略的不同，获得计算结果
     */
    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
