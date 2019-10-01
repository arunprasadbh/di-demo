package guru.springframework.didemo;

import guru.springframework.controllers.MyController;
import org.springframework.aop.TargetSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        //MyController controller = (MyController) ctx.getBean("myController");
        //controller.hello();
       // System.out.println(Arrays.asList(ctx.getBeanDefinitionNames()));
        List<String> beans = Arrays.asList(ctx.getBeanDefinitionNames());
        for (String bean : beans){
            System.out.println(bean);
        }
    }


}
