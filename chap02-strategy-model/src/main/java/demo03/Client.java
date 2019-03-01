package demo03;

import demo01.CashType;

public class Client {

    double total;

    public void cal(CashType type, double money) {
        CashContext csContext = new CashContext(type);
        double result = csContext.getResult(money);
        total += result;
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.total = 10000;
        //
        client.cal(CashType.NORMAL, 1000);

        System.out.println(client.total);
    }
}

/**
 *  简单工厂模式
 *  CashSuper csuper = CashFactory.createCashAccept(cashType);
 *
 *  csuper.getResult() ...
 *
 *  VS.
 *
 *  策略模式与简单工厂的结合
 *  CashContext cc = new CashContext(cashType);
 *  cc.getResult() ...
 *
 *  可见后者耦合更低（前者需要CashSuper和CashFactory，后者只需要知道CashContext）
 *
 */

/**
 * 小结概念：
 *
 * 策略模式是一种定义一系列算法的方法，从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，
 *  他可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合
 *
 *
 *  策略模式的Strateg类层次为Context定义了一系列的可供重用的算法和行为。继承有助于析取出这些算法中的公共功能。
 *
 *  策略模式的另外一个优点，简化了单元测试，因为每个算法都有自己的类，可以通过自己的接口单独测试
 */
