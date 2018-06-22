package property.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import property.demo.examplebeans.FakeDataSource;
import property.demo.examplebeans.FakeJmsBroker;

@SpringBootApplication
public class PropertyApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(PropertyApplication.class, args);
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());

        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUser());
    }
}
