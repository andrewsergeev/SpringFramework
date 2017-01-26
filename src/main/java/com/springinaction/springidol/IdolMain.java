package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by alsergeev on 24.01.2017.
 */

public class IdolMain {

    public static void main(String args[]) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");

        Performer eddie = (Performer) context.getBean("eddie");

        eddie.perform();
    }
}
