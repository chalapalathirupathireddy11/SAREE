package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.User;
import com.sarees.sarees.Repositry.UserRepository;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class DashBoardController {

    @Autowired
    UserRepository userRepository;

    @Value("${sareeShop.pageSize}")
    private int defaultPageSize;

    @Value("${sareeShop.contact.successMsg}")
    private String message;

    @Autowired
    Environment environment;

    @RequestMapping("/dashboard")
    public String displayDashboard(Model model, Authentication authentication, HttpSession session) {
        User user = userRepository.readByEmail(authentication.getName());
        model.addAttribute("username", user.getName());
        model.addAttribute("roles", authentication.getAuthorities().toString());
        if(null != user.getProducts() && null != user.getSareeShop().getName()){
            model.addAttribute("enrolledClass", user.getSareeShop().getName());
        }
        session.setAttribute("loggedInPerson", user);
        logMessages();
        return "dashboard.html";
    }

    private void logMessages() {
        log.error("Error message from the Dashboard page");
        log.warn("Warning message from the Dashboard page");
        log.info("Info message from the Dashboard page");
        log.debug("Debug message from the Dashboard page");
        log.trace("Trace message from the Dashboard page");

        log.error("defaultPageSize value with @Value annotation is : "+defaultPageSize);
        log.error("successMsg value with @Value annotation is : "+message);

        log.error("defaultPageSize value with Environment is : "+environment.getProperty("sareeShop.pageSize"));
        log.error("successMsg value with Environment is : "+environment.getProperty("sareeShop.contact.successMsg"));
        log.error("Java Home environment variable using Environment is : "+environment.getProperty("JAVA_HOME"));
    }
}
