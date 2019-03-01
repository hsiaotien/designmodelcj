package demo01;

/**
 * 打折收费子类
 */
public class CashRebate extends CashSuper {
    private double moneyRabate = 1d;

    public CashRebate(double moneyRabate) {
        this.moneyRabate = moneyRabate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRabate;
    }
}
