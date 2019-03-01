package demo01.another;

import demo01.CashSuper;
import demo01.CashType;

public class Client02 {

    public static void main(String[] args) {
        CashType02 csType = new CashReturn02(CashType.RETURN,200, 100);
        CashSuper cs = CashFactory02.createCashAccept(csType);
        double result = cs.acceptCash(1000);
        System.out.println(result);
    }
}
