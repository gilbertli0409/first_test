package com.lyp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@RequestMapping(value = "/")
public class HomeController
{
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String home(Locale locale, Model model)
    {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);
        model.addAttribute("serverTime", formattedDate );
        model.addAttribute("name", "GilbertLi" );
        return "home";
    }
    @RequestMapping(value="justified-nav",method = RequestMethod.GET)
    public String nav(Model model)
    {
        return "justified-nav";
    }
}
