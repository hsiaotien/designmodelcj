package demo01.another;

import demo01.CashType;

public class CashReturn02 extends CashType02 {

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn02(CashType type, double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
        super.setType(type);
    }

    @Override
    public double getMoneyCondition() {
        return moneyCondition;
    }

    public void setMoneyCondition(double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    @Override
    public double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }
}
