package spring_test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring_test.services.UserServiceImpl;



@Controller // контроллер ищет для себя представление
public class GeekbrainsController {

    @Autowired
    UserServiceImpl service;

    @RequestMapping("/") // указывает что обрабатываем корневой url
    public String index(Model model) {
        model.addAttribute("users", service.getUsers());

        return "index";
    }

}
