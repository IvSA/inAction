package ru.ivanov.spring.iperformer;

import ru.ivanov.spring.exception.PerformanceException;

public interface Performer {
    void perform() throws PerformanceException;
}
