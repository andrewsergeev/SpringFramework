package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alsergeev on 24.01.2017.
 */

public class IdolMain {
    @Autowired
    @Qualifier("eddie")
    private Instrumentalist eddie;

    @Autowired
    @Qualifier("guitar")
    private Instrument guitar;

    public static void main(String args[]) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");

        Performer eddie = (Performer) context.getBean("eddie");

        eddie.perform();
    }
}
