package cn.fty1.javasee.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class Fty1SpringBootApplication {

    private Logger logger = LoggerFactory.getLogger(Fty1SpringBootApplication.class);

    private final App app;

    @Autowired
    public Fty1SpringBootApplication(App app) {
        this.app = app;
    }

    @RequestMapping("/")
    public String index(){
        logger.info(app.toString());
        return "Fty1SpringBootApplication."+app.getVersion();
    }



    public static void main(String[] args) {
        SpringApplication.run(Fty1SpringBootApplication.class,args);
    }
}
