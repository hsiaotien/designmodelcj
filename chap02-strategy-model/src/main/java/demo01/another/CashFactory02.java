package demo01.another;

import demo01.CashNormal;
import demo01.CashRebate;
import demo01.CashReturn;
import demo01.CashSuper;

/**
 * 简单工厂模式
 */
public class CashFactory02 {

    public static CashSuper createCashAccept(CashType02 type02) {
        CashSuper cs = null;
        switch (type02.getType()) {
            case NORMAL: {
                cs = new CashNormal();
                break;
            }
            case RETURN: {
                cs = new CashReturn(type02.getMoneyCondition(),type02.getMoneyReturn());
                break;
            }
            case REBATE: {
                cs = new CashRebate(type02.getMoneyRebate());
                break;
            }
        }
        return cs;
    }
}
