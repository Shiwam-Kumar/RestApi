package login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class LoginSignup {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(LoginSignup.class, args);
       // LoginControl loginControl = context.getBean(LoginControl.class);
    }

}
