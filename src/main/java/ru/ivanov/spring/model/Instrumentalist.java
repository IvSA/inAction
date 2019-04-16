package ru.ivanov.spring.model;

import ru.ivanov.spring.exception.PerformanceException;
import ru.ivanov.spring.iperformer.Instrument;
import ru.ivanov.spring.iperformer.Performer;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public void setSong(String song) { // Внедрение мелодии
        this.song = song;
    }
    public String getSong() {
        return song;
    }
    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) { // Внедрение
        this.instrument = instrument; // инструмента
    }
}
