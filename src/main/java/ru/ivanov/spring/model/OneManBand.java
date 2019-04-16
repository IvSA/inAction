package ru.ivanov.spring.model;

import ru.ivanov.spring.exception.PerformanceException;
import ru.ivanov.spring.iperformer.Instrument;
import ru.ivanov.spring.iperformer.Performer;

import java.util.Map;

public class OneManBand implements Performer {

    private Map<String, Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments) {
        this.instruments = instruments; // Внедрение инструментов в виде отображения (Map)
    }
}

