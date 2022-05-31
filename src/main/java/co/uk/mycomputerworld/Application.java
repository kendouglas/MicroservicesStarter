package co.uk.mycomputerworld;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

import static org.springframework.boot.SpringApplication.run;

/**
 * @SpringBootApplication is in fact a collection of annotations:-
 * @Configuration: Indicates that this a Spring application context configuration file.
 * @EnableAutoConfiguration: Enables auto-configuration,
 * @ComponentScan: Enables scanning for Spring beans in the package of this class and all its sub packages.
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = run(Application.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

    }
}