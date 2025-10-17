package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.User;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Slf4j
@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("/displayProducts")
    public ModelAndView displayCourses(Model model, HttpSession session) {
        User person = (User) session.getAttribute("loggedInPerson");
        ModelAndView modelAndView = new ModelAndView("courses_enrolled.html");
        modelAndView.addObject("person",person);
        return modelAndView;
    }
}
