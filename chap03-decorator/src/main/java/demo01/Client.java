package demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger log = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Person xc = new Person("XiaoCai");

        log.info("\n 第一种装扮：");
        xc.wearTShirts();
        xc.wearBigTrouser();
        xc.wearSneakers();
        xc.show();

        log.info("\n 第二种装饰： ");
        xc.wearSuit();
        xc.wearTie();
        xc.wearLeatherShoes();
        xc.show();

    }
}
