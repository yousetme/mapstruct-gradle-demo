package run.halo.app;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Halo main class.
 *
 * @author ryanwang
 * @date 2017-11-14
 */
@SpringBootApplication
@EnableAsync
public class Application  {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        // Run application
        context = SpringApplication.run(Application.class, args);
    }


}
