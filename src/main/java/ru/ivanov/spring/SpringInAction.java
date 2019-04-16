package ru.ivanov.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ivanov.spring.exception.PerformanceException;
import ru.ivanov.spring.iperformer.Performer;

public class SpringInAction {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "configuration.xml");
        Performer performer = (Performer) ctx.getBean("hank");
        performer.perform();
    }
}
