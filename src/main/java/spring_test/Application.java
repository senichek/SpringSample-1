package spring_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan // Выполняет рекурсивный поиск по папкам проекта, данная
                // аннотация найдет класс помеченные аннотацией @Configuration (класс MvcConfig)
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


    }
}
