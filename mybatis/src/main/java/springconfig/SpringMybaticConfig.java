package springconfig;

import batis.FeedMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import service.FeedService;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
@Configuration
@EnableTransactionManagement
@ImportResource("classpath:datasource-mybatis.xml")
@Profile("mybatis")
public class SpringMybaticConfig {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Bean
    MapperFactoryBean<FeedMapper> feedMapper() {
        MapperFactoryBean<FeedMapper> mapperMapperFactoryBean = new MapperFactoryBean<>();
        mapperMapperFactoryBean.setMapperInterface(FeedMapper.class);
        mapperMapperFactoryBean.setSqlSessionFactory(sqlSessionFactory);
        return mapperMapperFactoryBean;
    }

    @Bean
    FeedService feedService() {
        return new FeedService();
    }
}
