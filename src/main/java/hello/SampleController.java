package hello;

import config.BaseConfig;
import config.BaseSetting;
import hello.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration

@SpringBootApplication
public class SampleController {

    @Autowired
    private SampleService sampleService;
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
        StringBuffer doge = new StringBuffer();
        doge.append("░░░░░░░░░▄░░░░░░░░░░░░░░▄").append("\n");
        doge.append("░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌").append("\n");
        doge.append("░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐").append("\n");
        doge.append("░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐").append("\n");
        doge.append("░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐").append("\n");
        doge.append("░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌").append("\n");
        doge.append("░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌").append("\n");
        doge.append("░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐").append("\n");
        doge.append("░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌").append("\n");
        doge.append("░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌").append("\n");
        doge.append("▌▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐").append("\n");
        doge.append("▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌").append("\n");
        doge.append("▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐").append("\n");
        doge.append("░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌").append("\n");
        doge.append("░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐").append("\n");
        doge.append("░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌").append("\n");
        doge.append("░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀").append("\n");
        doge.append("░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀").append("\n");
        doge.append("░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀");
        System.out.println(doge.toString());
    }
}