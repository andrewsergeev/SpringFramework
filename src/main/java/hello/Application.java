package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alsergeev on 23.01.2017.
 */

@SpringBootApplication
@RestController
public class Application {
    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    @RequestMapping("/dima")
    public String dima() {
        return "Hello Dima";
    }

    @RequestMapping("/andrey")
    public String andrey() {
        return "Hello andrey";
    }

    @RequestMapping("/greetingrest")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
