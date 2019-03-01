package demo02;

import demo01.CashNormal;
import demo01.CashRebate;
import demo01.CashReturn;
import demo01.CashType;

// 客户端主要代码
public class Client {

    double total; // 用于总计

    public void cal(CashType type, double money) {
        //
        CashContext cc = null;
        switch (type) {
            case NORMAL:{
                cc = new CashContext(new CashNormal());
                break;
            }
            case REBATE: {
                cc = new CashContext(new CashRebate(0.8));
                break;
            }
            case RETURN: {
                cc = new CashContext(new CashReturn(300,100));
            }
        }
        double result = cc.getResult(money);
        System.out.println(result);
        total += result;
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.total = 10000;
        //
        client.cal(CashType.RETURN, 1000);
        System.out.println(client.total);
    }
}
