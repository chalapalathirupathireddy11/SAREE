package com.sarees.sarees.Controller;

import com.sarees.sarees.Entity.Address;
import com.sarees.sarees.Entity.Profile;
import com.sarees.sarees.Entity.User;
import com.sarees.sarees.Repositry.UserRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ProfileController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/displayProfile")
    public ModelAndView displayMessages(Model model, HttpSession session) {
        User user = (User) session.getAttribute("loggedInPerson");
        Profile profile = new Profile();
        profile.setName(user.getName());
        profile.setMobileNumber(user.getMobile_number());
        profile.setEmail(user.getEmail());
        if(user.getAddress() !=null && user.getAddress().getAddress_id()>0){
            profile.setAddress1(user.getAddress().getAddress1());
            profile.setAddress2(user.getAddress().getAddress2());
            profile.setCity(user.getAddress().getCity());
            profile.setState(user.getAddress().getState());
            profile.setZipCode(user.getAddress().getZip_code());
        }
        ModelAndView modelAndView = new ModelAndView("profile.html");
        modelAndView.addObject("profile",profile);
        return modelAndView;
    }

    @PostMapping(value = "/updateProfile")
    public String updateProfile(@Valid @ModelAttribute("profile") Profile profile, Errors errors,
                                HttpSession session)
    {
        if(errors.hasErrors()){
            return "profile.html";
        }
        User user = (User) session.getAttribute("loggedInPerson");
        user.setName(profile.getName());
        user.setEmail(profile.getEmail());
        user.setMobile_number(profile.getMobileNumber());
        if(user.getAddress() ==null ){
            user.setAddress(new Address());
        }
        user.getAddress().setAddress1(profile.getAddress1());
        user.getAddress().setAddress2(profile.getAddress2());
        user.getAddress().setCity(profile.getCity());
        user.getAddress().setState(profile.getState());
        user.getAddress().setZip_code(profile.getZipCode());
        User savedPerson = userRepository.save(user);
        session.setAttribute("loggedInPerson", savedPerson);
        return "redirect:/displayProfile";
    }
}
