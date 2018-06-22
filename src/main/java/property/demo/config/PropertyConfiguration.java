package property.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import property.demo.examplebeans.FakeDataSource;
import property.demo.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
//@PropertySources({
   //     @PropertySource("classpath:datasource.properties"),
    //    @PropertySource("classpath:jms.properties")
//})
public class PropertyConfiguration {

    @Value("${property.demo.username}")
    String user;

    @Value("${property.demo.password}")
    String password;

    @Value("${property.demo.url}")
    String url;

    @Value("${property.jms.username}")
    String JMSuser;

    @Value("${property.jms.password}")
    String JMSpassword;

    @Value("${property.jms.url}")
    String JMSurl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public  FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new  FakeJmsBroker();
        fakeJmsBroker.setUser(JMSuser);
        fakeJmsBroker.setPassword(JMSpassword);
        fakeJmsBroker.setUrl(JMSurl);
        return fakeJmsBroker;
    }
   // @Bean
    //public static PropertySourcesPlaceholderConfigurer properties(){
       // PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        //return propertySourcesPlaceholderConfigurer;
   // }
}
