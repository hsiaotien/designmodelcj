package demo01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

    private static final Logger log = LoggerFactory.getLogger(Person.class);

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void wearTShirts() {
        log.info("大T恤");
    }

    public void wearBigTrouser() {
        log.info("垮裤");
    }

    public void wearSneakers() {
        log.info("破旧鞋");
    }

    public void wearSuit() {
        log.info("西装");
    }

    public void wearTie() {
        log.info("领带");
    }

    public void wearLeatherShoes() {
        log.info("皮靴");
    }

    public void show() {
        log.info("装扮的{}",name);
    }
}
