package springconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
@Configuration
@ImportResource("classpath:datasource-spring.xml")
@Profile("spring-data")
public class SpringDataConfig {
}
