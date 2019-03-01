package demo01.another;

import demo01.CashType;

public class CashType02 {

    private CashType type;

    public double getMoneyRebate() {
        return 1;
    }
    public double getMoneyCondition() {
        return Double.MAX_VALUE;
    }

    public double getMoneyReturn() {
        return 0;
    }

    public CashType getType() {
        return type;
    }

    public void setType(CashType type) {
        this.type = type;
    }
}
