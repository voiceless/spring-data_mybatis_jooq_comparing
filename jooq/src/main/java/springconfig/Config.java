package springconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by pbezglasnyi on 18.10.2016.
 */
@Configuration
@EnableTransactionManagement
@ImportResource("classpath:datasource-jooq.xml")
public class Config {
}
