package com.sarees.sarees.Controller;

import com.sarees.sarees.Dao.UserDao;
import com.sarees.sarees.Entity.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class PublicController {
    @Autowired
    private UserDao dao;

    @RequestMapping(value ="/register",method = { RequestMethod.GET})
    public String displayRegisterPage(Model model) {
        model.addAttribute("person", new User());
        return "register.html";
    }

    @RequestMapping(value ="/createUser",method = { RequestMethod.POST})
    public String createUser(@Valid @ModelAttribute("person") User user, Errors errors) {
        if(errors.hasErrors()){
            return "register.html";
        }
        boolean isSaved = dao.createNewPerson(user);
        if(isSaved){
            return "redirect:/login?register=true";
        }else {
            return "register.html";
        }
    }
}
