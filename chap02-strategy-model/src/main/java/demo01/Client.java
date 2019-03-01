package demo01;

public class Client {

    public static void main(String[] args) {
        CashSuper cs = CashFactory.createCashAccept(CashType.RETURN);
        //
        double total = 1000;
        double result = cs.acceptCash(total);
        System.out.println(result);
    }
}
