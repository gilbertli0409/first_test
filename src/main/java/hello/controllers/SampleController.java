package hello.controllers;

import hello.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lyp on 3/5/2017.
 */
@Controller
public class SampleController
{
    @Autowired
    private SampleService sampleService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello()
    {
        return "Hello World";
    }
}
