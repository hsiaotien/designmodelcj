package demo01;

/**
 * 简单工厂模式
 */
public class CashFactory {

    public static CashSuper createCashAccept(CashType type) {

       CashSuper cs = null;
       switch (type) {
           case NORMAL: {
               // 正常收费
               cs = new CashNormal();
               break;
           }
           case REBATE: {
               // 8折
               cs = new CashRebate(0.8);
               break;
           }
           case RETURN: {
               // 300 返 100
               cs = new CashReturn(300,100);
               break;
           }
       }
        return cs;
    }
}
