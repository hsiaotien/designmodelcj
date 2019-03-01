package demo01.another;

public class CashRebate02 extends CashType02 {
    private double moneyRebate;

    public CashRebate02(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double getMoneyRebate() {
        return moneyRebate;
    }

    public void setMoneyRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }
}
