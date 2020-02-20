package com.shiwam.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webview {
    @RequestMapping()
    public Alien fun(Alien a)
    {

        a.setName("Shiwam Kumar");
        a.setRollNo(72);
        a.setDept("ECE");
        a.disp();
        return  a.disp();
    }
}
