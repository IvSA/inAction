package ru.ivanov.spring.model;

import ru.ivanov.spring.exception.PerformanceException;
import ru.ivanov.spring.iperformer.Performer;

public class Juggler implements Performer {
    private int beanBags = 3;
    public Juggler() {
    }
    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }
    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
}