package sbauth.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * Created by quchy on 22/07/2017.
 */

@Configuration
@EnableConfigurationProperties
@EnableAutoConfiguration
@ComponentScan
//@PropertySource("classpath:/application.yml")
public class PersistenceConfiguration {
/*
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    */
}
