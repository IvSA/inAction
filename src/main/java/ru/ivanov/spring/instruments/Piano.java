package ru.ivanov.spring.instruments;

import ru.ivanov.spring.iperformer.Instrument;

public class Piano implements Instrument {

    public Piano() {
    }

    public void play() {
        System.out.println("PLINK PLINK PLINK");
    }
}
