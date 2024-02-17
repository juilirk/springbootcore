package com.itvedant.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itvedant.student.Student;


@Controller
public class FirstController {
    //So when client sends the request to the URL /
    //web server will call the method home mapped with this URL

    //String will be the name of the view file(html file)
    //that should be returned as the response


    //Dependency Injection
    @Autowired
    Student s;

    @Autowired
    Employee e;

    @RequestMapping("/")
    public String home(){
        System.out.println("Home Method Called");
        s.print();
        e.getSalary();
        return "homepage.html";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("about method called");
        return "aboutus.html";
    }
}
