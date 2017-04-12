package hello;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@CrossOrigin(origins = "http://localhost:63342")
@RestController
public class Application {
    @Autowired
    private UsersDao usersDao;

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

    @RequestMapping("/datajpa")
    public String datajpa() {
        return new Gson().toJson(usersDao.findAll());
    }

    @RequestMapping("/emailtest")
    public Iterable<Users> emailtest() {
        return usersDao.findAll();
    }

    @RequestMapping("/email")
    public String email() {
        return new Gson().toJson(usersDao.findByEmail("asergeev@avito.ru"));
    }



    @RequestMapping("/greetingrest")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
