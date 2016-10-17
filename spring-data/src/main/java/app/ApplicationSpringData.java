package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = "springconfig")
@EnableAutoConfiguration(exclude = {TransactionAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class ApplicationSpringData {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringData.class, args);
    }
}
