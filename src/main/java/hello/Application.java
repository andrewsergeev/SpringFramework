package hello;

import com.google.gson.Gson;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;


@SpringBootApplication
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

    @RequestMapping("/email")
    public String email() {
        return new Gson().toJson(usersDao.findByEmail("asergeev@avito.ru"));
    }

//    @RequestMapping("/htest")
//    public String htest() {
//        SessionFactory factory = getSessionFactory();
//        Session session = factory.getCurrentSession();
//
//        List<Users> users = session.createQuery("FROM Users").list();
//
//        session.close();
//
//        return new Gson().toJson(users);
//    }

    @RequestMapping("/greetingrest")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
